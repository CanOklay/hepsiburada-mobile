package com.hepsiburada.log;

import org.apache.log4j.PropertyConfigurator;

/**
 * Created by Fatih Can Oklay
 * Date: 22.08.2023
 */

public class Logs {

    public Logs() {
        PropertyConfigurator
                .configure(Logs.class.getClassLoader().getResource("log4j.properties"));
    }
}