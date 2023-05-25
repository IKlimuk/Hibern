package com.ua.robott.hibern.rest;

import com.ua.robott.hibern.domain.City;
import com.ua.robott.hibern.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;
    @PostMapping("/city")
    public void save (@RequestBody City city) {
        cityService.save(city);
    }
    @GetMapping("/city")
    public List<City> findAll() {
        return cityService.findAll();
    }
}
