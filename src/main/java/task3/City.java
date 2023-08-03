package task3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class City {
    @XmlAttribute(name = "size")
    private String size = "big";
    @XmlValue
    private String name;

    public City(){
    }

    public City(String size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{size='" + size + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}