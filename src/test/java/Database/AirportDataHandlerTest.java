package Database;

import entity.AirportEntity;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AirportDataHandlerTest {

    @ParameterizedTest
    @MethodSource("provideKnownAirports")
    void getAirportData(String input) {
        System.out.println("Testing airport: " + input);
        assertTrue(AirportDataHandler.getAirportData(input));
    }

    private static Stream<String> provideKnownAirports() {
        WeatherDatabaseHandler db = new WeatherDatabaseHandler();
        List<String> airports = new ArrayList<>();
        for(AirportEntity airport : db.getAllAirports()) {
            System.out.println("Airport: " + airport.getAirportCode());
            airports.add(airport.getAirportCode());
        }
        return airports.stream();
    }
}