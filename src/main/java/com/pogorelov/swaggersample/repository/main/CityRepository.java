package com.pogorelov.swaggersample.repository.main;

import com.pogorelov.swaggersample.domain.main.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CityRepository extends JpaRepository<City, Long> {
}
