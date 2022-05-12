package com.example.projectbackend.controller;

import com.example.projectbackend.model.dto.ConseilDTO;
import com.example.projectbackend.service.ConseilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.SecondaryTable;
import java.util.Set;

@RestController
@RequestMapping("/conseil")
@CrossOrigin // Fait appel a l'API
public class ConseilController {
    @Autowired
    private ConseilService conseilService;
    @GetMapping
    private Set<ConseilDTO> getConseils(){ return conseilService.getConseils();}
}
