package com.practiceOrmwithMySQL.JPAwithMySQL.controller;

import com.practiceOrmwithMySQL.JPAwithMySQL.model.Country;
import com.practiceOrmwithMySQL.JPAwithMySQL.service.CountryServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryServiceImplementation service;

    @GetMapping("/country")
    public List<Country> getAllCountries(){
        return service.getAllCountries();
    }

    @PostMapping()
    public void saveCountry(@RequestBody Country country){
        service.saveCountry(country);
    }

    @DeleteMapping("/{countryName}")
    public void deleteCountryByName(@PathVariable String countryName){
        service.deleteCountrybyName(countryName);
    }
}
