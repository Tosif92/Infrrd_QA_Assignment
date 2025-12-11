package com.travel.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;
    private final String propertyFilePath = "src/main/resources/config.properties";

    public ConfigReader() {
        try {
            FileInputStream fileInputStream = new FileInputStream(propertyFilePath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}