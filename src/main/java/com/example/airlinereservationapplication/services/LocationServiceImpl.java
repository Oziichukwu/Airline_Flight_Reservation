package com.example.airlinereservationapplication.services;

import com.example.airlinereservationapplication.data.models.Location;
import com.example.airlinereservationapplication.data.repositories.LocationRepository;
import com.example.airlinereservationapplication.web.exceptions.LocationDoesNotExistException;
import com.example.airlinereservationapplication.web.exceptions.LocationLogicException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationRepository locationRepository;


    @Override
    public Location saveLocation(Location location) {
        return saveThisLocation(location);
    }

    private Location saveThisLocation(Location location){
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Location location, Long id) {

        Location locationToUpdate = locationRepository.findById(id).orElseThrow(()->
                new LocationLogicException("Location with id" + id + " does not exist"));

        locationToUpdate.setCode(location.getCode());
        locationToUpdate.setName(location.getName());
        locationToUpdate.setType(location.getType());

        return saveThisLocation(locationToUpdate);
    }

    @Override
    public void deleteLocation(Location location) {
        locationRepository.delete(location);
    }

    @Override
    public Location findLocationById(Long id) {

           Optional<Location> foundLocation= locationRepository.findById(id);
              return foundLocation.orElseThrow(()->
                    new LocationDoesNotExistException("Location does not exist"));
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }
}
