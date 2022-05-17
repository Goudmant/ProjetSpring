package com.example.projectbackend.controller;

import com.example.projectbackend.model.dto.MedecinDTO;
import com.example.projectbackend.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@CrossOrigin
@RestController
@RequestMapping("/medecin")
public class MedecinController {

    @Autowired
    private MedecinService medecinService;

    @PostMapping
    public MedecinDTO save (@RequestBody MedecinDTO medecinDTO){
        return medecinService.save(medecinDTO);
    }
    @GetMapping
    public Set<MedecinDTO> getMedecins(){
        return medecinService.getMedecins();}


}
