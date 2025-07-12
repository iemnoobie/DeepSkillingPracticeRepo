package com.wek4.Week4.Model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    private static final Logger log = LoggerFactory.getLogger(Country.class);
    private String Code;
    private String name;

    public Country() {
        log.info("Inside Country Constructor");
    }

    public Country(String code, String name) {
        Code = code;
        this.name = name;
    }


    public String getCode() {
        log.info("Fetching country code");
        return Code;
    }

    public void setCode(String code) {
        log.info("Setting country code");
        Code = code;
    }

    public String getName() {
        log.info("Fetching country name");
        return name;
    }

    public void setName(String name) {
        log.info("Setting country name");
        this.name = name;
    }


    @Override
    public String toString() {
        return "Country{" +
                "Code='" + Code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
