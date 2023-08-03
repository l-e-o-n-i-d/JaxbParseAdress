package task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "country")
public class Country {
    @XmlElement(name = "region")
    private List<Region> regions = new ArrayList<>();

    public void add(Region region){
        regions.add(region);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(regions.toArray());
    }
}
