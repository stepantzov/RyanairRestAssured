package auto.ryanair.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReaderUtility {
    public static String getPropertyByName(String propertyName) {
        String propertyValue = null;
        Properties properties = new Properties();
        InputStream input = null;
        try {
            String filename = "config.properties";
            input = PropertiesReaderUtility.class.getClassLoader().getResourceAsStream(filename);
            if (input == null) {
                System.out.println("Sorry, unable to find specified file");
            }
            properties.load(input);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }
}