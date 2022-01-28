package com.example.hibernate.controller;

import com.example.hibernate.models.Location;
import com.example.hibernate.models.User;
import com.example.hibernate.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/location/{id}/users")
    public List<User> getUsersByLocation(@PathVariable("id") Integer id){
        Optional<Location> location = locationService.getLocationById(id);

        if(location.isPresent()){
            Location newLocation = location.get();
            return newLocation.getUsers();
        }
        return  null;
    }


    @PostMapping("/location/addnew")
    public void AddLocation(@RequestBody Location location) {
        locationService.addLocation(location);
    }
}
