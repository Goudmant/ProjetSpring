package com.example.projectbackend.service;


import com.example.projectbackend.mapper.ConseilMapper;
import com.example.projectbackend.model.dto.ConseilDTO;
import com.example.projectbackend.model.dto.QuestionsDTO;
import com.example.projectbackend.model.entity.Conseil;
import com.example.projectbackend.model.entity.Medecin;
import com.example.projectbackend.model.entity.Questions;
import com.example.projectbackend.model.entity.Theme;
import com.example.projectbackend.repository.ConseilRepository;
import com.example.projectbackend.repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ConseilService {
    @Autowired
    private ConseilRepository conseilRepository;
    @Autowired
    private ConseilMapper conseilMapper;
    @Autowired
    private MedecinRepository medecinRepository;

    public ConseilDTO save (ConseilDTO conseilDTO){
        return conseilMapper.ToDto(
                conseilRepository.save(conseilMapper.ToEntity(conseilDTO))
        );
    }
    public Set<ConseilDTO> getConseils(){
        return conseilRepository.findAll()
                .stream()
                .map(conseilMapper::ToDto)
                .collect(Collectors.toSet());
    }
    public ConseilDTO getConseilById(int id){
        return conseilMapper.ToDto(
                conseilRepository.findById(id).orElse(null)
        );
    }

    public String deleteConseil (int id) {
        conseilRepository.deleteById(id);
        return "Conseil deleted";
    }

    public ConseilDTO addMedecin(int idConseil,int idMedecin) {
        Conseil conseil = conseilRepository.findById(idConseil).orElse(null);
        Medecin medecin = medecinRepository.findById(idMedecin).orElse(null);
        if (conseil != null ){
            conseil.getMedecin().add(medecin);
            return conseilMapper.ToDto(conseilRepository.save(conseil));
        }else{
            return null;
        }

    }
    public List<ConseilDTO> getAllConseil(){
        return conseilRepository.findAll()
                .stream()
                .map(conseilMapper::ToDto)
                .collect(Collectors.toList());
    }
}
