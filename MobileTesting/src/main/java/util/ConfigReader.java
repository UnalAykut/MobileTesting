package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    public static Properties initialize_Properties() throws IOException {
        properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("src/test/resources/config.properties");
        properties.load( fileInputStream );
        return getProperties();
    }
    public static Properties getProperties(){
        return properties;
    }
}
