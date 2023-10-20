package Database;

import WeatherConfigurator.AirportWeather;
import WeatherConfigurator.WeatherConfigurator;
import entity.AirportEntity;
import entity.WeatherdataEntity;

import java.lang.reflect.Method;

public class AirportDataHandler {
    public static boolean getAirportData(String identifier) {
        boolean out = false;
        WeatherDatabaseHandler db = new WeatherDatabaseHandler();
        WeatherConfigurator weatherConfigurator = new WeatherConfigurator();
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
            out = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }
}
