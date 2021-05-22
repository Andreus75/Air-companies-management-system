package com.andriy.air_management.service.airCompanyService;

import com.andriy.air_management.entity.AirCompany;

import java.util.List;

public interface AirCompanyService {

    void saveAirCompany(AirCompany airCompany);
    AirCompany findAirCompanyById(int idCompany);
    List<AirCompany> findAllAirCompany();
    void deleteAirCompanyById(int idCompany);
}
