package com.example.projectbackend.mapper;

import com.example.projectbackend.model.dto.ReponsesDTO;
import com.example.projectbackend.model.entity.Reponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReponsesMapper {

    @Autowired
    private PatientMapper patientMapper;

    @Autowired
    private QuestionsMapper questionsMapper;


    public ReponsesDTO ToDto (Reponses reponses){
        if (reponses == null){
            return null;
        }
        ReponsesDTO dto = new ReponsesDTO();
        dto.setId(reponses.getIdReponse());
        dto.setNomReponse(reponses.getNomReponse());
        dto.setPatient(patientMapper.ToDto(reponses.getPatient()));
        dto.setQuestion(questionsMapper.ToDto(reponses.getQuestion()));

        return dto;
    }

    public Reponses toEntity(ReponsesDTO reponsesDTO) {
        Reponses entity = new Reponses();
        entity.setIdReponse(reponsesDTO.getId());
        entity.setNomReponse(reponsesDTO.getNomReponse());
        entity.setPatient(patientMapper.toEntity(reponsesDTO.getPatient()));
        entity.setQuestion(questionsMapper.toEntity(reponsesDTO.getQuestion()));

        return entity;
    }

}
