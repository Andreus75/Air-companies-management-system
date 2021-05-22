package com.andriy.air_management.dao;

import com.andriy.air_management.entity.AirCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirCompanyDao extends JpaRepository<AirCompany, Integer> {
}
