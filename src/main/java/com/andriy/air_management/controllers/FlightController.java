package com.andriy.air_management.controllers;


import com.andriy.air_management.entity.Flight;
import com.andriy.air_management.service.flightService.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }


    @PostMapping("/addAFlight")
    public String addAFlight(Flight flight) {
        flightService.saveFlight(flight);
        return "redirect:/";
    }

    @GetMapping("/allFlight")
    public String findAllFlight (Model model) {
        model.addAttribute("flights", flightService.findAllFlight());
        return "allFlights";
    }
}
