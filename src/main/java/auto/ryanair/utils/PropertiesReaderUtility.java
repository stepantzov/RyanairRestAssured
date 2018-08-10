package auto.ryanair.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReaderUtility {
    public static String getPropertyByName(String propertyName) {
        String propertyValue = null;
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("System.properties"));
            propertyValue = properties.getProperty(propertyName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }
}