package com.ua.robott.hibern.rest;

import com.ua.robott.hibern.domain.City;
import com.ua.robott.hibern.domain.Country;
import com.ua.robott.hibern.service.CityService;
import com.ua.robott.hibern.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;
    @PostMapping("/country")
    public void save (@RequestBody Country country) {
        countryService.save(country);
    }
    @GetMapping("/country")
    public List<Country> findAll() {
        return countryService.findAll();
    }
}
