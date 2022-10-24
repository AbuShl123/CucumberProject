package com.abu.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("config.properties");
            properties.load(file);

            file.close();
        } catch (IOException ignored){}
    }

    public static String getProperty(String property) {
        return properties.getProperty(property);
    }
}
