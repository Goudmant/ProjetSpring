package com.example.projectbackend.service;

import com.example.projectbackend.mapper.MedecinMapper;
import com.example.projectbackend.model.dto.MedecinDTO;
import com.example.projectbackend.repository.ConseilRepository;
import com.example.projectbackend.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MedecinService {
    @Autowired
    private MedecinRepository medecinRepository;
    @Autowired
    private MedecinMapper medecinMapper;


    public MedecinDTO save (MedecinDTO medecinDTO){
        return medecinMapper.ToDto(
                medecinRepository.save(medecinMapper.toEntity(medecinDTO))
        );
    }
    public String deleteMedecin (int id) {
        medecinRepository.deleteById(id);
        return "Medecin deleted";
    }
    public Set<MedecinDTO> getMedecins(){
        return medecinRepository.findAll()
                .stream()
                .map(medecinMapper::ToDto)
                .collect(Collectors.toSet());
    }
    public MedecinDTO getMedecinById(int id){
        return medecinMapper.ToDto(
                medecinRepository.findById(id).orElse(null)
        );
    }
}
