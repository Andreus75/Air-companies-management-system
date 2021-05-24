package com.andriy.air_management.controllers;

import com.andriy.air_management.entity.AirCompany;
import com.andriy.air_management.service.airCompanyService.AirCompanyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AirCompanyController {

    private final AirCompanyService airCompanyService;

    public AirCompanyController(AirCompanyService airCompanyService) {
        this.airCompanyService = airCompanyService;
    }

    // Save new air company
    @PostMapping("/addAirCompany")
    public String addAirCompany(AirCompany airCompany) {
        airCompanyService.saveAirCompany(airCompany);
        return "redirect:/";
    }

    //  find all air company
    @GetMapping("/allAirCompanies")
    public String findAllAirCompany (Model model) {
        model.addAttribute("airCompanies", airCompanyService.findAllAirCompany());
        return "allAirCompanies";
    }

    //   delete AirCompany
    @PostMapping("/allAirCompanies/{idCompany}")
    public String deleteAirCompany (@PathVariable(value = "idCompany") int idCompany) {
        airCompanyService.deleteAirCompanyById(idCompany);
        return "redirect:/allAirCompanies";
    }
}
