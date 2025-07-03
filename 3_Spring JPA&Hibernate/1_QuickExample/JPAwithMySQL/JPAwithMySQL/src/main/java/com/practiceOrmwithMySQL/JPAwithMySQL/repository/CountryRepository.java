package com.practiceOrmwithMySQL.JPAwithMySQL.repository;

import com.practiceOrmwithMySQL.JPAwithMySQL.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
