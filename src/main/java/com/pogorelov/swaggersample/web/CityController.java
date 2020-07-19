package com.pogorelov.swaggersample.web;

import com.pogorelov.swaggersample.domain.main.City;
import com.pogorelov.swaggersample.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/cities")
@RequiredArgsConstructor
@RestController
public class CityController {

    private final CityService cityService;

    /*
    * Это комментарий, чтобы показать на GitHub
    * */

    @GetMapping
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }
}
