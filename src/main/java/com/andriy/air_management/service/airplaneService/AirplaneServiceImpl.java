package com.andriy.air_management.service.airplaneService;

import com.andriy.air_management.dao.AirplaneDao;
import com.andriy.air_management.entity.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AirplaneServiceImpl implements AirplaneService {

    @Autowired
    private AirplaneDao airplaneDao;

    @Override
    public void saveAirplane(Airplane airplane) {
        if (airplane != null) {
            airplaneDao.save(airplane);
        }
    }

    @Override
    public Airplane findAirCompanyById(int idAirplane) {
        Airplane airplane = airplaneDao.findById(idAirplane).orElse(new Airplane());
        return airplane;
    }

    @Override
    public List<Airplane> findAllAirplane() {
        List<Airplane> airplanes = airplaneDao.findAll();
        return airplanes;
    }

    @Override
    public void deleteAirCompanyById(int idAirplane) {
        airplaneDao.deleteById(idAirplane);
    }
}
