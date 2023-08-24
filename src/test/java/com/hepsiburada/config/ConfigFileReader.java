package com.hepsiburada.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Fatih Can Oklay
 * Date: 22.08.2023
 */

public class ConfigFileReader {

    private final Properties properties;

    public ConfigFileReader(){
        BufferedReader reader;
        String propertyFilePath = "src/main/java/com/hepsiburada/configuration/config.properties";
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("configs.properties not found at " + propertyFilePath);
        }
    }

    public String getAndroidEmulator() {
        String androidEmulator = properties.getProperty("androidEmulator");
        if(androidEmulator != null) return androidEmulator;
        else throw new RuntimeException("AndroidEmulator not specified in the configs.properties file.");
    }

    public String getAndroidEmulatorName() {
        String androidEmulatorName = properties.getProperty("androidEmulatorName");
        if(androidEmulatorName != null) return androidEmulatorName;
        else throw new RuntimeException("AndroidEmulator not specified in the configs.properties file.");
    }

    public String getAndroidEmulatorVersion() {
        String androidEmulatorVersion = properties.getProperty("androidEmulatorVersion");
        if(androidEmulatorVersion != null) return androidEmulatorVersion;
        else throw new RuntimeException("AndroidEmulatorVersion not specified in the configs.properties file.");
    }

    public String getHubUrl() {
        String hubUrl = properties.getProperty("hubUrl");
        if(hubUrl != null) return hubUrl;
        else throw new RuntimeException("HubUrl not specified in the configs.properties file.");
    }

    public String getBaseUrl() {
        String baseUrl = properties.getProperty("baseUrl");
        if(baseUrl != null) return baseUrl;
        else throw new RuntimeException("BaseUrl not specified in the configs.properties file.");
    }

    public long getImplicityWait() {
        String implicityWait = properties.getProperty("implicityWait");
        if(implicityWait != null) return Long.parseLong(implicityWait);
        else throw new RuntimeException("ImplicitlyWait not specified in the configs.properties file.");
    }
}
