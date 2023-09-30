package Database;

import entity.AirportEntity;
import entity.WeatherdataEntity;
import jakarta.persistence.*;

import java.util.List;

public class WeatherDatabaseHandler {
    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;
    EntityTransaction transaction;



    public WeatherDatabaseHandler() {
        entityManagerFactory = Persistence.createEntityManagerFactory("default");
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
    }

    public List<AirportEntity> getAllAirports() {
        List<AirportEntity> list = null;
        try {
            TypedQuery<AirportEntity> allAirports = entityManager.createNamedQuery("AirportEntity.getAll", AirportEntity.class);
            list = allAirports.getResultList();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public AirportEntity getAirportByCode(String identifier) {
        AirportEntity airport = null;

        try {
            transaction.begin();

            TypedQuery<AirportEntity> airportByCodeQuery = entityManager.createNamedQuery("AirportEntity.byCode", AirportEntity.class);
            airportByCodeQuery.setParameter(1, identifier);
            if (airportByCodeQuery.getResultList().size() == 0) {
                System.out.println("Airport not found... creating new.");
                airport = new AirportEntity(identifier);
                WeatherdataEntity weatherdata = new WeatherdataEntity();
                airport.setWeatherDataId(weatherdata);
            } else {
                System.out.println("Airport found!");
                airport = airportByCodeQuery.getResultList().get(0);
            }

            entityManager.persist(airport);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return airport;
    }

    public void saveAirportData(AirportEntity airport) {
        try {
            transaction.begin();

            entityManager.persist(airport);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
