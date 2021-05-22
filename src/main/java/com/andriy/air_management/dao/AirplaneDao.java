package com.andriy.air_management.dao;

import com.andriy.air_management.entity.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneDao extends JpaRepository<Airplane, Integer> {

}
