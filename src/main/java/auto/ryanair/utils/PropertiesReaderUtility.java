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
            input = PropertiesReaderUtility.class.getClassLoader().getResourceAsStream("config.properties");
            if (input == null) {
                System.out.println("unable to find specified file");
            }
            properties.load(input);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return propertyValue;
    }
}