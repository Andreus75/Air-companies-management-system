package com.andriy.air_management.service.flightService;

import com.andriy.air_management.entity.Flight;

import java.util.List;

public interface FlightService {
    void saveFlight(Flight flight);
    Flight findFlightById(int idFlight);
    List<Flight> findAllFlight();
    void deleteFlightById(int idFlight);
}
