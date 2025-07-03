package com.practiceOrmwithMySQL.JPAwithMySQL.service;


import com.practiceOrmwithMySQL.JPAwithMySQL.model.Country;

import java.util.List;

public interface CountryService{

    public List<Country> getAllCountries();
    public void saveCountry(Country country);
    public void deleteCountrybyName(String countryName);

}