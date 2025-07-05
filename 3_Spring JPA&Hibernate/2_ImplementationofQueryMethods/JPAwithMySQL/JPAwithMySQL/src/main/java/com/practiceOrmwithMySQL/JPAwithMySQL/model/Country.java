package com.practiceOrmwithMySQL.JPAwithMySQL.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="country")
public class Country {

    @Id
    @Column(name="code")
    private String countryCode;

    @Column(name="name")
    private String countryName;

    public Country() {
    }

    public Country(String countryCode, String countryName) {
        this.countryCode = countryCode;
        countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", CountryName='" + countryName + '\'' +
                '}';
    }
}
