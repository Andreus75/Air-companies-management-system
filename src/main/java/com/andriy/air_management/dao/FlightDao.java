package com.andriy.air_management.dao;

import com.andriy.air_management.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightDao extends JpaRepository<Flight, Integer> {
}
