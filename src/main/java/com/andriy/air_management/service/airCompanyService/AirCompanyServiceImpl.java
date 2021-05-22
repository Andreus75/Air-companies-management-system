package com.andriy.air_management.service.airCompanyService;

import com.andriy.air_management.dao.AirCompanyDao;
import com.andriy.air_management.entity.AirCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AirCompanyServiceImpl implements AirCompanyService {

    @Autowired
    private AirCompanyDao airCompanyDao;

    @Override
    public void saveAirCompany(AirCompany airCompany) {
        if (airCompany != null) {
            airCompanyDao.save(airCompany);
        }

    }

    @Override
    public AirCompany findAirCompanyById(int idCompany) {
        AirCompany airCompany = airCompanyDao.findById(idCompany).orElse(new AirCompany());
        return airCompany;
    }

    @Override
    public List<AirCompany> findAllAirCompany() {
        List<AirCompany> airCompanies = airCompanyDao.findAll();
        return airCompanies;
    }

    @Override
    public void deleteAirCompanyById(int idCompany) {
        airCompanyDao.deleteById(idCompany);
    }
}
