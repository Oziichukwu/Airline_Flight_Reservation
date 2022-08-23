package com.example.airlinereservationapplication.web.controllers;


import com.example.airlinereservationapplication.data.models.Location;
import com.example.airlinereservationapplication.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/airlineReservation")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap){
       Location locationSaved =  locationService.saveLocation(location);
       String msg = " Location saved with id " + locationSaved.getId();
       modelMap.addAttribute("msg", msg);
        return "createLocation";
    }
}
