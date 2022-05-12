package com.example.projectbackend.service;


import com.example.projectbackend.mapper.ConseilMapper;
import com.example.projectbackend.model.dto.ConseilDTO;
import com.example.projectbackend.repository.ConseilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ConseilService {
    @Autowired
    private ConseilRepository conseilRepository;
    @Autowired
    private ConseilMapper conseilMapper;

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
}
