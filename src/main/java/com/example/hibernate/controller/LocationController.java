package com.example.hibernate.controller;

import com.example.hibernate.models.Location;
import com.example.hibernate.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getAllLocation(){
        return locationService.getAllLocation();
    }

    @GetMapping("/location/{id}")
    public Optional<Location> getLocationById(@PathVariable("id") Integer id){
        return locationService.getLocationById(id);
    }
}
