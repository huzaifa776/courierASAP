package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

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

    public int getTracking() {
        return tracking;
    }

    public void setTracking(int tracking) {
        this.tracking = tracking;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHouseAndStreet() {
        return houseAndStreet;
    }

    public void setHouseAndStreet(String houseAndStreet) {
        this.houseAndStreet = houseAndStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDestHouseAndStreet() {
        return destHouseAndStreet;
    }

    public void setDestHouseAndStreet(String destHouseAndStreet) {
        this.destHouseAndStreet = destHouseAndStreet;
    }

    public String getDestCity() {
        return destCity;
    }

    public void setDestCity(String destCity) {
        this.destCity = destCity;
    }

    public String getDestPostcode() {
        return destPostcode;
    }

    public void setDestPostcode(String destPostcode) {
        this.destPostcode = destPostcode;
    }

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
