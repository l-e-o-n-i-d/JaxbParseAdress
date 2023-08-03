package task3;

import javax.xml.bind.*;
import java.io.File;

public class JaxbTools {
    public static void readFromXml(File file){
        try {
            Country countryFromXml;
            JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            countryFromXml = (Country) unmarshaller.unmarshal(file);
            System.out.println(countryFromXml);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void saveToXml(File file){
        try {
            Country countryToXml = new Country();
            countryToXml.add(new Region(new City("big","Kyiv"), "Strajesko", "1"));
            countryToXml.add(new Region(new City("big","Lviv"), "Shevchenko", "7"));
            JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            // Читабельне форматування
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            // Записуємо у файл, marshal(з пам'яті, у файл)
            marshaller.marshal(countryToXml, file);
            marshaller.marshal(countryToXml, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
