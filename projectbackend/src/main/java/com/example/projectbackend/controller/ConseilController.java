package com.example.projectbackend.controller;

import com.example.projectbackend.mapper.MedecinMapper;
import com.example.projectbackend.model.dto.ConseilDTO;
import com.example.projectbackend.model.dto.QuestionsDTO;
import com.example.projectbackend.service.ConseilService;
import com.example.projectbackend.service.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/conseil")
@CrossOrigin
public class ConseilController {
    @Autowired
    private ConseilService conseilService;


    @GetMapping
    private Set<ConseilDTO> getConseils(){ return conseilService.getConseils();}

    @GetMapping("/conseil/{idMedecin}")
    public ConseilDTO getAllByMedecin (@PathVariable int idMedecin){
        return conseilService.getConseilById(idMedecin);
    }
    @PutMapping("/medecin/{idConseil}")
    public ConseilDTO addMedecin(@PathVariable int idConseil, @RequestParam int idMedecin) {
        return conseilService.addMedecin(idConseil, idMedecin);
    }
}
