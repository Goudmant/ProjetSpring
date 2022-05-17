package com.example.projectbackend.mapper;
import com.example.projectbackend.model.dto.PatientDTO;
import com.example.projectbackend.model.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;


@Service
public class PatientMapper {

    @Autowired
    private ThemeMapper themeMapper;

    public PatientDTO ToDto (Patient patient) {
        System.out.println(patient.getFirstname());
        PatientDTO dto = new PatientDTO();
        dto.setId(patient.getIdPatients());
        dto.setLastname(patient.getLastname());
        dto.setFirstname(patient.getFirstname());
        dto.setPhone(patient.getPhone());
        dto.setMail(patient.getMail());
        if(patient.getTheme() != null) {

            dto.setTheme(patient.getTheme()
                    .stream()
                    .map(themeMapper::ToTdo)
                    .collect(Collectors.toSet()));
        }

        return dto;
    }
    public Patient toEntity (PatientDTO patientDTO) {
        Patient entity = new Patient();
        entity.setIdPatients(patientDTO.getId());
        entity.setLastname(patientDTO.getLastname());
        entity.setFirstname(patientDTO.getFirstname());
        entity.setPhone(patientDTO.getPhone());
        entity.setMail(patientDTO.getMail());
        entity.setTheme(patientDTO.getTheme()
                .stream()
                .map(themeMapper::toEntity)
                .collect(Collectors.toSet()));


        return entity;
    }
}

