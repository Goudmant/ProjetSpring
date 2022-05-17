package com.example.projectbackend.controller;

import com.example.projectbackend.model.dto.PatientDTO;
import com.example.projectbackend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
@CrossOrigin
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;
    @GetMapping
    public Set<PatientDTO> getPatients(){
        return patientService.getPatients();
    }


}
