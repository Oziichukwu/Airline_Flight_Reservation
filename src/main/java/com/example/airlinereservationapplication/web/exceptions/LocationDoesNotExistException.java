package com.example.airlinereservationapplication.web.exceptions;

public class LocationDoesNotExistException extends LocationLogicException {

    public LocationDoesNotExistException(String message) {
        super(message);
    }
}
