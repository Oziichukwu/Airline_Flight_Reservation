package com.example.airlinereservationapplication.services;

import com.example.airlinereservationapplication.data.models.Location;

import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);

    Location updateLocation(Location location, Long id);

    void deleteLocation(Location location);

    Location findLocationById(Long id);

    List<Location> getAllLocations();
}
