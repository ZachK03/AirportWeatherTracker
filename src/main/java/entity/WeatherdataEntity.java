package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "weatherdata", schema = "airportweathertracker", catalog = "")
public class WeatherdataEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "WeatherDataID")
    private int weatherDataId;
    @Basic
    @Column(name = "Count01")
    private Integer count01 = 0;
    @Basic
    @Column(name = "Total01")
    private Integer total01 = 0;
    @Basic
    @Column(name = "Count02")
    private Integer count02 = 0;
    @Basic
    @Column(name = "Total02")
    private Integer total02 = 0;
    @Basic
    @Column(name = "Count03")
    private Integer count03 = 0;
    @Basic
    @Column(name = "Total03")
    private Integer total03 = 0;
    @Basic
    @Column(name = "Count04")
    private Integer count04 = 0;
    @Basic
    @Column(name = "Total04")
    private Integer total04 = 0;
    @Basic
    @Column(name = "Count05")
    private Integer count05 = 0;
    @Basic
    @Column(name = "Total05")
    private Integer total05 = 0;
    @Basic
    @Column(name = "Count06")
    private Integer count06 = 0;
    @Basic
    @Column(name = "Total06")
    private Integer total06 = 0;
    @Basic
    @Column(name = "Count07")
    private Integer count07 = 0;
    @Basic
    @Column(name = "Total07")
    private Integer total07 = 0;
    @Basic
    @Column(name = "Count08")
    private Integer count08 = 0;
    @Basic
    @Column(name = "Total08")
    private Integer total08 = 0;
    @Basic
    @Column(name = "Count09")
    private Integer count09 = 0;
    @Basic
    @Column(name = "Total09")
    private Integer total09 = 0;
    @Basic
    @Column(name = "Count10")
    private Integer count10 = 0;
    @Basic
    @Column(name = "Total10")
    private Integer total10 = 0;
    @Basic
    @Column(name = "Count11")
    private Integer count11 = 0;
    @Basic
    @Column(name = "Total11")
    private Integer total11 = 0;
    @Basic
    @Column(name = "Count12")
    private Integer count12 = 0;
    @Basic
    @Column(name = "Total12")
    private Integer total12 = 0;
    @Basic
    @Column(name = "Count13")
    private Integer count13 = 0;
    @Basic
    @Column(name = "Total13")
    private Integer total13 = 0;
    @Basic
    @Column(name = "Count14")
    private Integer count14 = 0;
    @Basic
    @Column(name = "Total14")
    private Integer total14 = 0;
    @Basic
    @Column(name = "Count15")
    private Integer count15 = 0;
    @Basic
    @Column(name = "Total15")
    private Integer total15 = 0;
    @Basic
    @Column(name = "Count16")
    private Integer count16 = 0;
    @Basic
    @Column(name = "Total16")
    private Integer total16 = 0;
    @Basic
    @Column(name = "Count17")
    private Integer count17 = 0;
    @Basic
    @Column(name = "Total17")
    private Integer total17 = 0;
    @Basic
    @Column(name = "Count18")
    private Integer count18 = 0;
    @Basic
    @Column(name = "Total18")
    private Integer total18 = 0;
    @Basic
    @Column(name = "Count19")
    private Integer count19 = 0;
    @Basic
    @Column(name = "Total19")
    private Integer total19 = 0;
    @Basic
    @Column(name = "Count20")
    private Integer count20 = 0;
    @Basic
    @Column(name = "Total20")
    private Integer total20 = 0;
    @Basic
    @Column(name = "Count21")
    private Integer count21 = 0;
    @Basic
    @Column(name = "Total21")
    private Integer total21 = 0;
    @Basic
    @Column(name = "Count22")
    private Integer count22 = 0;
    @Basic
    @Column(name = "Total22")
    private Integer total22 = 0;
    @Basic
    @Column(name = "Count23")
    private Integer count23 = 0;
    @Basic
    @Column(name = "Total23")
    private Integer total23 = 0;
    @Basic
    @Column(name = "Count24")
    private Integer count00 = 0;
    @Basic
    @Column(name = "Total24")
    private Integer total00 = 0;

    public int getWeatherDataId() {
        return weatherDataId;
    }

    public void setWeatherDataId(int weatherDataId) {
        this.weatherDataId = weatherDataId;
    }

    public Integer getCount01() {
        return count01;
    }

    public void setCount01(Integer count01) {
        this.count01 = count01;
    }

    public Integer getTotal01() {
        return total01;
    }

    public void setTotal01(Integer total01) {
        this.total01 = total01;
    }

    public Integer getCount02() {
        return count02;
    }

    public void setCount02(Integer count02) {
        this.count02 = count02;
    }

    public Integer getTotal02() {
        return total02;
    }

    public void setTotal02(Integer total02) {
        this.total02 = total02;
    }

    public Integer getCount03() {
        return count03;
    }

    public void setCount03(Integer count03) {
        this.count03 = count03;
    }

    public Integer getTotal03() {
        return total03;
    }

    public void setTotal03(Integer total03) {
        this.total03 = total03;
    }

    public Integer getCount04() {
        return count04;
    }

    public void setCount04(Integer count04) {
        this.count04 = count04;
    }

    public Integer getTotal04() {
        return total04;
    }

    public void setTotal04(Integer total04) {
        this.total04 = total04;
    }

    public Integer getCount05() {
        return count05;
    }

    public void setCount05(Integer count05) {
        this.count05 = count05;
    }

    public Integer getTotal05() {
        return total05;
    }

    public void setTotal05(Integer total05) {
        this.total05 = total05;
    }

    public Integer getCount06() {
        return count06;
    }

    public void setCount06(Integer count06) {
        this.count06 = count06;
    }

    public Integer getTotal06() {
        return total06;
    }

    public void setTotal06(Integer total06) {
        this.total06 = total06;
    }

    public Integer getCount07() {
        return count07;
    }

    public void setCount07(Integer count07) {
        this.count07 = count07;
    }

    public Integer getTotal07() {
        return total07;
    }

    public void setTotal07(Integer total07) {
        this.total07 = total07;
    }

    public Integer getCount08() {
        return count08;
    }

    public void setCount08(Integer count08) {
        this.count08 = count08;
    }

    public Integer getTotal08() {
        return total08;
    }

    public void setTotal08(Integer total08) {
        this.total08 = total08;
    }

    public Integer getCount09() {
        return count09;
    }

    public void setCount09(Integer count09) {
        this.count09 = count09;
    }

    public Integer getTotal09() {
        return total09;
    }

    public void setTotal09(Integer total09) {
        this.total09 = total09;
    }

    public Integer getCount10() {
        return count10;
    }

    public void setCount10(Integer count10) {
        this.count10 = count10;
    }

    public Integer getTotal10() {
        return total10;
    }

    public void setTotal10(Integer total10) {
        this.total10 = total10;
    }

    public Integer getCount11() {
        return count11;
    }

    public void setCount11(Integer count11) {
        this.count11 = count11;
    }

    public Integer getTotal11() {
        return total11;
    }

    public void setTotal11(Integer total11) {
        this.total11 = total11;
    }

    public Integer getCount12() {
        return count12;
    }

    public void setCount12(Integer count12) {
        this.count12 = count12;
    }

    public Integer getTotal12() {
        return total12;
    }

    public void setTotal12(Integer total12) {
        this.total12 = total12;
    }

    public Integer getCount13() {
        return count13;
    }

    public void setCount13(Integer count13) {
        this.count13 = count13;
    }

    public Integer getTotal13() {
        return total13;
    }

    public void setTotal13(Integer total13) {
        this.total13 = total13;
    }

    public Integer getCount14() {
        return count14;
    }

    public void setCount14(Integer count14) {
        this.count14 = count14;
    }

    public Integer getTotal14() {
        return total14;
    }

    public void setTotal14(Integer total14) {
        this.total14 = total14;
    }

    public Integer getCount15() {
        return count15;
    }

    public void setCount15(Integer count15) {
        this.count15 = count15;
    }

    public Integer getTotal15() {
        return total15;
    }

    public void setTotal15(Integer total15) {
        this.total15 = total15;
    }

    public Integer getCount16() {
        return count16;
    }

    public void setCount16(Integer count16) {
        this.count16 = count16;
    }

    public Integer getTotal16() {
        return total16;
    }

    public void setTotal16(Integer total16) {
        this.total16 = total16;
    }

    public Integer getCount17() {
        return count17;
    }

    public void setCount17(Integer count17) {
        this.count17 = count17;
    }

    public Integer getTotal17() {
        return total17;
    }

    public void setTotal17(Integer total17) {
        this.total17 = total17;
    }

    public Integer getCount18() {
        return count18;
    }

    public void setCount18(Integer count18) {
        this.count18 = count18;
    }

    public Integer getTotal18() {
        return total18;
    }

    public void setTotal18(Integer total18) {
        this.total18 = total18;
    }

    public Integer getCount19() {
        return count19;
    }

    public void setCount19(Integer count19) {
        this.count19 = count19;
    }

    public Integer getTotal19() {
        return total19;
    }

    public void setTotal19(Integer total19) {
        this.total19 = total19;
    }

    public Integer getCount20() {
        return count20;
    }

    public void setCount20(Integer count20) {
        this.count20 = count20;
    }

    public Integer getTotal20() {
        return total20;
    }

    public void setTotal20(Integer total20) {
        this.total20 = total20;
    }

    public Integer getCount21() {
        return count21;
    }

    public void setCount21(Integer count21) {
        this.count21 = count21;
    }

    public Integer getTotal21() {
        return total21;
    }

    public void setTotal21(Integer total21) {
        this.total21 = total21;
    }

    public Integer getCount22() {
        return count22;
    }

    public void setCount22(Integer count22) {
        this.count22 = count22;
    }

    public Integer getTotal22() {
        return total22;
    }

    public void setTotal22(Integer total22) {
        this.total22 = total22;
    }

    public Integer getCount23() {
        return count23;
    }

    public void setCount23(Integer count23) {
        this.count23 = count23;
    }

    public Integer getTotal23() {
        return total23;
    }

    public void setTotal23(Integer total23) {
        this.total23 = total23;
    }

    public Integer getCount00() {
        return count00;
    }

    public void setCount00(Integer count00) {
        this.count00 = count00;
    }

    public Integer getTotal00() {
        return total00;
    }

    public void setTotal00(Integer total00) {
        this.total00 = total00;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherdataEntity that = (WeatherdataEntity) o;

        if (weatherDataId != that.weatherDataId) return false;
        if (count01 != null ? !count01.equals(that.count01) : that.count01 != null) return false;
        if (total01 != null ? !total01.equals(that.total01) : that.total01 != null) return false;
        if (count02 != null ? !count02.equals(that.count02) : that.count02 != null) return false;
        if (total02 != null ? !total02.equals(that.total02) : that.total02 != null) return false;
        if (count03 != null ? !count03.equals(that.count03) : that.count03 != null) return false;
        if (total03 != null ? !total03.equals(that.total03) : that.total03 != null) return false;
        if (count04 != null ? !count04.equals(that.count04) : that.count04 != null) return false;
        if (total04 != null ? !total04.equals(that.total04) : that.total04 != null) return false;
        if (count05 != null ? !count05.equals(that.count05) : that.count05 != null) return false;
        if (total05 != null ? !total05.equals(that.total05) : that.total05 != null) return false;
        if (count06 != null ? !count06.equals(that.count06) : that.count06 != null) return false;
        if (total06 != null ? !total06.equals(that.total06) : that.total06 != null) return false;
        if (count07 != null ? !count07.equals(that.count07) : that.count07 != null) return false;
        if (total07 != null ? !total07.equals(that.total07) : that.total07 != null) return false;
        if (count08 != null ? !count08.equals(that.count08) : that.count08 != null) return false;
        if (total08 != null ? !total08.equals(that.total08) : that.total08 != null) return false;
        if (count09 != null ? !count09.equals(that.count09) : that.count09 != null) return false;
        if (total09 != null ? !total09.equals(that.total09) : that.total09 != null) return false;
        if (count10 != null ? !count10.equals(that.count10) : that.count10 != null) return false;
        if (total10 != null ? !total10.equals(that.total10) : that.total10 != null) return false;
        if (count11 != null ? !count11.equals(that.count11) : that.count11 != null) return false;
        if (total11 != null ? !total11.equals(that.total11) : that.total11 != null) return false;
        if (count12 != null ? !count12.equals(that.count12) : that.count12 != null) return false;
        if (total12 != null ? !total12.equals(that.total12) : that.total12 != null) return false;
        if (count13 != null ? !count13.equals(that.count13) : that.count13 != null) return false;
        if (total13 != null ? !total13.equals(that.total13) : that.total13 != null) return false;
        if (count14 != null ? !count14.equals(that.count14) : that.count14 != null) return false;
        if (total14 != null ? !total14.equals(that.total14) : that.total14 != null) return false;
        if (count15 != null ? !count15.equals(that.count15) : that.count15 != null) return false;
        if (total15 != null ? !total15.equals(that.total15) : that.total15 != null) return false;
        if (count16 != null ? !count16.equals(that.count16) : that.count16 != null) return false;
        if (total16 != null ? !total16.equals(that.total16) : that.total16 != null) return false;
        if (count17 != null ? !count17.equals(that.count17) : that.count17 != null) return false;
        if (total17 != null ? !total17.equals(that.total17) : that.total17 != null) return false;
        if (count18 != null ? !count18.equals(that.count18) : that.count18 != null) return false;
        if (total18 != null ? !total18.equals(that.total18) : that.total18 != null) return false;
        if (count19 != null ? !count19.equals(that.count19) : that.count19 != null) return false;
        if (total19 != null ? !total19.equals(that.total19) : that.total19 != null) return false;
        if (count20 != null ? !count20.equals(that.count20) : that.count20 != null) return false;
        if (total20 != null ? !total20.equals(that.total20) : that.total20 != null) return false;
        if (count21 != null ? !count21.equals(that.count21) : that.count21 != null) return false;
        if (total21 != null ? !total21.equals(that.total21) : that.total21 != null) return false;
        if (count22 != null ? !count22.equals(that.count22) : that.count22 != null) return false;
        if (total22 != null ? !total22.equals(that.total22) : that.total22 != null) return false;
        if (count23 != null ? !count23.equals(that.count23) : that.count23 != null) return false;
        if (total23 != null ? !total23.equals(that.total23) : that.total23 != null) return false;
        if (count00 != null ? !count00.equals(that.count00) : that.count00 != null) return false;
        if (total00 != null ? !total00.equals(that.total00) : that.total00 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = weatherDataId;
        result = 31 * result + (count01 != null ? count01.hashCode() : 0);
        result = 31 * result + (total01 != null ? total01.hashCode() : 0);
        result = 31 * result + (count02 != null ? count02.hashCode() : 0);
        result = 31 * result + (total02 != null ? total02.hashCode() : 0);
        result = 31 * result + (count03 != null ? count03.hashCode() : 0);
        result = 31 * result + (total03 != null ? total03.hashCode() : 0);
        result = 31 * result + (count04 != null ? count04.hashCode() : 0);
        result = 31 * result + (total04 != null ? total04.hashCode() : 0);
        result = 31 * result + (count05 != null ? count05.hashCode() : 0);
        result = 31 * result + (total05 != null ? total05.hashCode() : 0);
        result = 31 * result + (count06 != null ? count06.hashCode() : 0);
        result = 31 * result + (total06 != null ? total06.hashCode() : 0);
        result = 31 * result + (count07 != null ? count07.hashCode() : 0);
        result = 31 * result + (total07 != null ? total07.hashCode() : 0);
        result = 31 * result + (count08 != null ? count08.hashCode() : 0);
        result = 31 * result + (total08 != null ? total08.hashCode() : 0);
        result = 31 * result + (count09 != null ? count09.hashCode() : 0);
        result = 31 * result + (total09 != null ? total09.hashCode() : 0);
        result = 31 * result + (count10 != null ? count10.hashCode() : 0);
        result = 31 * result + (total10 != null ? total10.hashCode() : 0);
        result = 31 * result + (count11 != null ? count11.hashCode() : 0);
        result = 31 * result + (total11 != null ? total11.hashCode() : 0);
        result = 31 * result + (count12 != null ? count12.hashCode() : 0);
        result = 31 * result + (total12 != null ? total12.hashCode() : 0);
        result = 31 * result + (count13 != null ? count13.hashCode() : 0);
        result = 31 * result + (total13 != null ? total13.hashCode() : 0);
        result = 31 * result + (count14 != null ? count14.hashCode() : 0);
        result = 31 * result + (total14 != null ? total14.hashCode() : 0);
        result = 31 * result + (count15 != null ? count15.hashCode() : 0);
        result = 31 * result + (total15 != null ? total15.hashCode() : 0);
        result = 31 * result + (count16 != null ? count16.hashCode() : 0);
        result = 31 * result + (total16 != null ? total16.hashCode() : 0);
        result = 31 * result + (count17 != null ? count17.hashCode() : 0);
        result = 31 * result + (total17 != null ? total17.hashCode() : 0);
        result = 31 * result + (count18 != null ? count18.hashCode() : 0);
        result = 31 * result + (total18 != null ? total18.hashCode() : 0);
        result = 31 * result + (count19 != null ? count19.hashCode() : 0);
        result = 31 * result + (total19 != null ? total19.hashCode() : 0);
        result = 31 * result + (count20 != null ? count20.hashCode() : 0);
        result = 31 * result + (total20 != null ? total20.hashCode() : 0);
        result = 31 * result + (count21 != null ? count21.hashCode() : 0);
        result = 31 * result + (total21 != null ? total21.hashCode() : 0);
        result = 31 * result + (count22 != null ? count22.hashCode() : 0);
        result = 31 * result + (total22 != null ? total22.hashCode() : 0);
        result = 31 * result + (count23 != null ? count23.hashCode() : 0);
        result = 31 * result + (total23 != null ? total23.hashCode() : 0);
        result = 31 * result + (count00 != null ? count00.hashCode() : 0);
        result = 31 * result + (total00 != null ? total00.hashCode() : 0);
        return result;
    }
}
