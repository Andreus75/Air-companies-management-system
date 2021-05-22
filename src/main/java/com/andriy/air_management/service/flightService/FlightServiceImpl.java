package com.andriy.air_management.service.flightService;

import com.andriy.air_management.dao.FlightDao;
import com.andriy.air_management.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightDao flightDao;

    @Override
    public void saveFlight(Flight flight) {
        if (flight != null) {
            flightDao.save(flight);
        }
    }

    @Override
    public Flight findFlightById(int idFlight) {
        Flight flight = flightDao.findById(idFlight).orElse(new Flight());
        return flight;
    }

    @Override
    public List<Flight> findAllFlight() {
        List<Flight> flights = flightDao.findAll();
        return flights;
    }

    @Override
    public void deleteFlightById(int idFlight) {
        flightDao.deleteById(idFlight);
    }
}
