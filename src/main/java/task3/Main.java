package task3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File fileIn = new File("src\\main\\resources\\adress.xml");
        File fileOut = new File("src\\main\\resources\\adress2.xml");
        JaxbTools.readFromXml(fileIn);
        JaxbTools.saveToXml(fileOut);
    }
}
