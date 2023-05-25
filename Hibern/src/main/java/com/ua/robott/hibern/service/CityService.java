package com.ua.robott.hibern.service;

import com.ua.robott.hibern.domain.City;
import com.ua.robott.hibern.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;
    public List<City> findAll() {
        return cityRepository.findAll();
    }
    public void save (City city) {
        cityRepository.save(city);
    }
}
