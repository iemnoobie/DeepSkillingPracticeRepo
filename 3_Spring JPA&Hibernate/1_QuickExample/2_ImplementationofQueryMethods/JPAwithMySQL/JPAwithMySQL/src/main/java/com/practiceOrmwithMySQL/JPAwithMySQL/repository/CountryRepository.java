package com.practiceOrmwithMySQL.JPAwithMySQL.repository;

import com.practiceOrmwithMySQL.JPAwithMySQL.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByCountryNameContaining(String keyword);
    List<Country> findByCountryNameContainingOrderByCountryNameAsc(String keyword);
    List<Country> findByCountryNameStartingWith(String prefix);
}
