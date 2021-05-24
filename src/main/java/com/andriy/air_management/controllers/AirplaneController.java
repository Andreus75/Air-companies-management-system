package com.andriy.air_management.controllers;

import com.andriy.air_management.entity.Airplane;
import com.andriy.air_management.service.airplaneService.AirplaneService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class AirplaneController {

    private final AirplaneService airplaneService;

    public AirplaneController(AirplaneService airplaneService) {
        this.airplaneService = airplaneService;
    }

    //  add and save new airplane
    @PostMapping("/addAirplane")
    public String addAirplane(Airplane airplane) {
        airplaneService.saveAirplane(airplane);
        return "redirect:/";
    }

    //   find all airplanes
    @GetMapping("/allAirplane")
    public String findAllAirlane (Model model) {
        model.addAttribute("airplanes", airplaneService.findAllAirplane());
        return "allAirplane";
    }



//    @DeleteMapping("/allAirplane/deleteAirplane/{idAirplane}")
//    public String deleteAirplane(@PathVariable(value = "idAirplane") int idAirplane) {
//        System.out.println(idAirplane);
//        System.out.println("delete--------------------------------");
//        airplaneService.deleteAirplaneById(idAirplane);
//
//        return "redirect:/allAirplane";
//    }

    @DeleteMapping("/allAirplane/deleteAirplane/{idAirplane}")
    public String deleteAirplane(@PathVariable(value = "idAirplane") int idAirplane) {
        System.out.println("delete-------------------");
        airplaneService.deleteAirplaneById(idAirplane);
        return "redirect:/allAirplane";
    }

}
