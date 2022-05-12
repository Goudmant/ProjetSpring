package com.example.projectbackend.service;

import com.example.projectbackend.mapper.PatientMapper;
import com.example.projectbackend.model.dto.MedecinDTO;
import com.example.projectbackend.model.dto.PatientDTO;
import com.example.projectbackend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PatientMapper patientMapper;

    public PatientDTO save (PatientDTO patientDTO){
        return patientMapper.ToDto(
                patientRepository.save(patientMapper.toEntity(patientDTO))
        );
    }

    public Set<PatientDTO> getPatients(){
        return patientRepository.findAll()
                .stream()
                .map(patientMapper::ToDto)
                .collect(Collectors.toSet());
    }
    public PatientDTO getPatientById(int id){
        return patientMapper.ToDto(
                patientRepository.findById(id).orElse(null)
        );
    }
    public String deletePatient (int id) {
        patientRepository.deleteById(id);
        return "Patient deleted";
    }
}
