package entity;

import jakarta.persistence.*;

@Entity
@NamedQuery(name = "AirportEntity.getAll", query = "SELECT a FROM AirportEntity a")
@NamedQuery(name = "AirportEntity.byCode", query = "SELECT a FROM AirportEntity a WHERE a.airportCode = ?1")
@Table(name = "airport", schema = "airportweathertracker", catalog = "")
public class AirportEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "AirportID")
    private int airportId;
    @Basic
    @Column(name = "AirportCode")
    private String airportCode;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="WeatherDataID")
    private WeatherdataEntity weatherDataId;

    public AirportEntity() {}

    public AirportEntity(String airportCode) {
        this.airportCode = airportCode;
    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public WeatherdataEntity getWeatherDataId() {
        return weatherDataId;
    }

    public void setWeatherDataId(WeatherdataEntity weatherDataId) {
        this.weatherDataId = weatherDataId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AirportEntity that = (AirportEntity) o;

        if (airportId != that.airportId) return false;
        if (airportCode != null ? !airportCode.equals(that.airportCode) : that.airportCode != null) return false;
        if (weatherDataId != null ? !weatherDataId.equals(that.weatherDataId) : that.weatherDataId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = airportId;
        result = 31 * result + (airportCode != null ? airportCode.hashCode() : 0);
        result = 31 * result + (weatherDataId != null ? weatherDataId.hashCode() : 0);
        return result;
    }
}
