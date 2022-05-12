package com.example.projectbackend.controller;

import com.example.projectbackend.model.dto.MedecinDTO;
import com.example.projectbackend.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/medecin")
public class MedecinController {

    @Autowired
    private MedecinService medecinService;
    @GetMapping
    public Set<MedecinDTO> getMedecins(){ return medecinService.getMedecins();}
}
