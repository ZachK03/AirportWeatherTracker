import Database.AirportDataHandler;
import Database.WeatherDatabaseHandler;
import GUI.OverlapBar;
import WeatherConfigurator.*;
import entity.AirportEntity;
import entity.WeatherdataEntity;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static WeatherDatabaseHandler db = new WeatherDatabaseHandler();
    public static AirportDataHandler dataHandler = new AirportDataHandler();

    public static String getIdentifier() {
        Scanner scanner = new Scanner(System.in);
        String identifier;
        do {
            System.out.println("Enter the airport code: ");
            identifier = scanner.nextLine();
        } while (identifier.length() != 4);
        return identifier;
    }

    public static void main(String[] args) {

        boolean skipInput = false;
        String identifier = null;
        List<AirportEntity> allAirports = db.getAllAirports();

        if(args.length > 0) {
            switch (args[0]) {
                case "run":
                    System.out.println("Displaying all known airports.");
                    for(AirportEntity airport : allAirports) {
                        List<Integer> totals = new ArrayList<>();
                        List<Integer> counts = new ArrayList<>();
                        try {
                            WeatherdataEntity weatherData = airport.getWeatherDataId();

                            for (int i = 0; i < 24; i++) {
                                String buffer = "";
                                if (i < 10) buffer = "0";
                                Method getCount = weatherData.getClass().getMethod("getCount" + buffer + i);
                                Method getTotal = weatherData.getClass().getMethod("getTotal" + buffer + i);

                                totals.add((Integer) getTotal.invoke(weatherData));
                                counts.add((Integer) getCount.invoke(weatherData));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        System.out.println(totals);
                        System.out.println(counts);
                        OverlapBar chart = new OverlapBar();
                        chart.createChart(counts, totals, airport.getAirportCode());
                    }
                    return;
                case "test":
                    System.out.println("Testing all known airports.");
                    for(AirportEntity e : allAirports) {
                        dataHandler.getAirportData(e.getAirportCode());
                    }
                    break;
            }
        }

        for(AirportEntity airport : db.getAllAirports()) {
            System.out.println("Airport found: " + airport.getAirportCode());
        }

        if(!skipInput) {
            identifier = getIdentifier();
        }

        dataHandler.getAirportData(identifier);
    }
}
