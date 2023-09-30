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
    public static String getIdentifier() {
        Scanner scanner = new Scanner(System.in);
        String identifier = "";
        do {
            System.out.println("Enter the airport code: ");
            identifier = scanner.nextLine();
        } while (identifier.length() != 4);
        return identifier;
    }

    public static void main(String[] args) {
        WeatherDatabaseHandler db = new WeatherDatabaseHandler();
        WeatherConfigurator weatherConfigurator = new WeatherConfigurator();

        boolean skipInput = false;
        String identifier = null;

        if(args.length > 0) {
            switch (args[0]) {
                case "run":
                    identifier = getIdentifier();

                    List<Integer> totals = new ArrayList<Integer>();
                    List<Integer> counts = new ArrayList<Integer>();
                    try {
                        AirportEntity airport = db.getAirportByCode(identifier);
                        WeatherdataEntity weatherData = airport.getWeatherDataId();

                        for (int i = 0; i < 24; i++) {
                            String buffer = "";
                            if(i < 10) buffer = "0";
                            Method getCount = weatherData.getClass().getMethod("getCount" + buffer + i);
                            Method getTotal = weatherData.getClass().getMethod("getTotal" + buffer + i);

                            totals.add((Integer) getTotal.invoke(weatherData));
                            counts.add((Integer) getCount.invoke(weatherData));
                        };
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println(totals);
                    System.out.println(counts);
                    OverlapBar chart = new OverlapBar();
                    chart.createChart(counts,totals);
                    return;
                case "test":
                    if(args.length != 2) return;
                    identifier = args[1];
                    skipInput = true;
                    break;
            }
        }

        if(!skipInput) {
            identifier = getIdentifier();
        }

        try {
            AirportEntity airport = db.getAirportByCode(identifier);
            WeatherdataEntity weatherData = airport.getWeatherDataId();
            AirportWeather airportWeather = weatherConfigurator.getWeather(identifier);
            String hour = airportWeather.getTime().substring(0, 2);

            System.out.println("Hour: " + hour);

            Method getCount = weatherData.getClass().getMethod("getCount" + hour);
            Method setCount = weatherData.getClass().getMethod("setCount" + hour, Integer.class);
            Method getTotal = weatherData.getClass().getMethod("getTotal" + hour);
            Method setTotal = weatherData.getClass().getMethod("setTotal" + hour, Integer.class);

            Integer currentCount = (Integer) getCount.invoke(weatherData);

            if(airportWeather.isBadWeather()) {
                System.out.println("Bad weather detected.");
                setCount.invoke(weatherData, currentCount + 1);
            } else {
                System.out.println("Good weather detected.");
            }

            Integer totalCount = (Integer) getTotal.invoke(weatherData);
            setTotal.invoke(weatherData, totalCount + 1);

            db.saveAirportData(airport);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
