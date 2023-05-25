package com.ua.robott.hibern.service;

import com.ua.robott.hibern.domain.Country;
import com.ua.robott.hibern.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    public void save(Country country) {
        countryRepository.save(country);
    }
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}
