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
    @Column(name="co_code")
    private String countryCode;

    @Column(name="co_name")
    private String CountryName;

    public Country() {
    }

    public Country(String countryCode, String countryName) {
        this.countryCode = countryCode;
        CountryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode='" + countryCode + '\'' +
                ", CountryName='" + CountryName + '\'' +
                '}';
    }
}
