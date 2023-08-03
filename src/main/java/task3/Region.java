package task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="region")
public class Region {
    private City city;
    private String street;
    private String house;

    public Region() {
    }

    public Region(City city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Region{" +
                "City=" + city +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }

    public City getCity() {
        return city;
    }
    @XmlElement
    public void setCity(City city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }
    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }
    @XmlElement
    public void setHouse(String house) {
        this.house = house;
    }
}
