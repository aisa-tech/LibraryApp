package com.cydeo.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    static private Properties properties = new Properties(); // it is static coz we are using it in static method

    static{
        try{
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
