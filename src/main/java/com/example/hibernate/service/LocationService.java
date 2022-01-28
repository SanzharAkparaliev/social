package com.example.hibernate.service;

import com.example.hibernate.models.Location;
import com.example.hibernate.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocation() {
        return (List<Location>) locationRepository.findAll();
    }

    public Optional<Location> getLocationById(Integer id) {
        return locationRepository.findById(id);
    }

    public void addLocation(Location location){
        locationRepository.save(location);
    }
}
