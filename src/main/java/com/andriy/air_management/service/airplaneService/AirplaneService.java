package com.andriy.air_management.service.airplaneService;

import com.andriy.air_management.entity.Airplane;

import java.util.List;

public interface AirplaneService {

    void saveAirplane(Airplane airplane);
    Airplane findAirCompanyById(int idAirplane);
    List<Airplane> findAllAirplane();
    void deleteAirplaneById(int idAirplane);
}
