package com.example.projectbackend.service;

import com.example.projectbackend.mapper.ReponsesMapper;
import com.example.projectbackend.model.dto.ReponsesDTO;
import com.example.projectbackend.repository.ReponsesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;


@Service
public class ReponseService {
    @Autowired
    ReponsesRepository reponsesRepository;
    @Autowired
    ReponsesMapper reponsesMapper;

    public ReponsesDTO save (ReponsesDTO reponsesDTO){
        return reponsesMapper.ToDto(
          reponsesRepository.save(reponsesMapper.toEntity(reponsesDTO))
        );
    }
    public Set<ReponsesDTO> getReponses(){
        return reponsesRepository.findAll()
                .stream()
                .map(reponsesMapper::ToDto)
                .collect(Collectors.toSet());
    }
    public ReponsesDTO getReponceById(int id ){
        return reponsesMapper.ToDto(
                reponsesRepository.findById(id).orElse(null)
        );
    }
    public String deletedReponse (int id ){
        reponsesRepository.deleteById(id);
        return "Reponse deleted";
    }
}
