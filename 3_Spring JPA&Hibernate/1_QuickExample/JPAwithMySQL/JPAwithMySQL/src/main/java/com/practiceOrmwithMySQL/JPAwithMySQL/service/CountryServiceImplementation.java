package com.practiceOrmwithMySQL.JPAwithMySQL.service;

import com.practiceOrmwithMySQL.JPAwithMySQL.model.Country;
import com.practiceOrmwithMySQL.JPAwithMySQL.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImplementation implements CountryService{

    @Autowired
    private CountryRepository repo;


    @Override
    public List<Country> getAllCountries() {
        return repo.findAll();
    }

    @Override
    public void saveCountry(Country country) {
        repo.save(country);

    }

    @Override
    public void deleteCountrybyName(String countryName) {
        repo.deleteById(countryName);

    }
}
