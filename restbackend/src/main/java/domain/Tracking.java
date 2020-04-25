package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "TrackingEntity")
@Table(name = "Tracking")
public class Tracking implements Serializable {
    private int tracking;
    private String status;
    private String houseAndStreet;
    private String city;
    private String postcode;
    private int id;
    private String fullName;
    private String destHouseAndStreet;
    private String destCity;
    private String destPostcode;
    private String destFullName;

    @Basic
    @Column(name = "tracking", nullable = false)
    public int getTracking() {
        return tracking;
    }

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 1)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "HouseAndStreet", nullable = false, length = 256)
    public String getHouseAndStreet() {
        return houseAndStreet;
    }

    public void setHouseAndStreet(String houseAndStreet) {
        this.houseAndStreet = houseAndStreet;
    }

    @Basic
    @Column(name = "City", nullable = false, length = 15)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Postcode", nullable = false, length = 8)
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fullName", nullable = false, length = 30)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "DestHouseAndStreet", nullable = false, length = 250)
    public String getDestHouseAndStreet() {
        return destHouseAndStreet;
    }

    public void setDestHouseAndStreet(String destHouseAndStreet) {
        this.destHouseAndStreet = destHouseAndStreet;
    }

    @Basic
    @Column(name = "DestCity", nullable = false, length = 30)
    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    @Basic
    @Column(name = "DestPostcode", nullable = true, length = 8)
    public String getDestPostcode() {
        return destPostcode;
    }

    public void setDestPostcode(String destPostcode) {
        this.destPostcode = destPostcode;
    }

    @Basic
    @Column(name = "destFullName", nullable = false, length = 30)
    public String getDestFullName() {
        return destFullName;
    }

    public void setDestFullName(String destFullName) {
        this.destFullName = destFullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tracking that = (Tracking) o;
        return tracking == that.tracking &&
                id == that.id &&
                Objects.equals(status, that.status) &&
                Objects.equals(houseAndStreet, that.houseAndStreet) &&
                Objects.equals(city, that.city) &&
                Objects.equals(postcode, that.postcode) &&
                Objects.equals(fullName, that.fullName) &&
                Objects.equals(destHouseAndStreet, that.destHouseAndStreet) &&
                Objects.equals(destCity, that.destCity) &&
                Objects.equals(destPostcode, that.destPostcode) &&
                Objects.equals(destFullName, that.destFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracking, status, houseAndStreet, city, postcode, id, fullName, destHouseAndStreet, destCity, destPostcode, destFullName);
    }

    @Override
    public String toString() {
        return "Tracking{" +
                "tracking=" + tracking +
                ", status='" + status + '\'' +
                ", houseAndStreet='" + houseAndStreet + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", id=" + id +
                ", fullName='" + fullName + '\'' +
                ", destHouseAndStreet='" + destHouseAndStreet + '\'' +
                ", destCity='" + destCity + '\'' +
                ", destPostcode='" + destPostcode + '\'' +
                ", destFullName='" + destFullName + '\'' +
                '}';
    }
}
