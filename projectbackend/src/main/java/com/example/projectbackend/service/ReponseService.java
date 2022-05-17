package com.example.projectbackend.service;

import com.example.projectbackend.mapper.QuestionsMapper;
import com.example.projectbackend.mapper.ReponsesMapper;
import com.example.projectbackend.model.dto.ReponsesDTO;
import com.example.projectbackend.model.entity.Patient;
import com.example.projectbackend.model.entity.Questions;
import com.example.projectbackend.model.entity.Reponses;
import com.example.projectbackend.repository.PatientRepository;
import com.example.projectbackend.repository.QuestionsRepository;
import com.example.projectbackend.repository.ReponsesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


@Service
public class ReponseService {
    @Autowired
    private ReponsesRepository reponsesRepository;
    @Autowired
    private ReponsesMapper reponsesMapper;
    @Autowired
    private QuestionsMapper questionsMapper;
    @Autowired
    private QuestionsRepository questionsRepository;
    @Autowired
    private PatientRepository patientRepository;

    public ReponsesDTO save(ReponsesDTO reponsesDTO, int idQuestion, int idPatient) {
        Reponses reponses = reponsesMapper.toEntity(reponsesDTO);
        Questions question = questionsRepository.findById(idQuestion).orElse(null);
        Patient patient = patientRepository.findById(idPatient).orElse(null);
        reponses.setQuestion(question);
        reponses.setPatient(patient);
        return reponsesMapper.ToDto(
                reponsesRepository.save(reponses)
        );
    }

    public Set<ReponsesDTO> getReponses() {
        return reponsesRepository.findAll()
                .stream()
                .map(reponsesMapper::ToDto)
                .collect(Collectors.toSet());
    }

    public ReponsesDTO getReponceById(int id) {
        return reponsesMapper.ToDto(
                reponsesRepository.findById(id).orElse(null)
        );
    }

    public String deletedReponse(int id) {
        reponsesRepository.deleteById(id);
        return "Reponse deleted";
    }

    public List<ReponsesDTO> getAllByQuestion(int id) {
        List<Reponses> reponses = reponsesRepository.findAll();
        Questions questions = questionsRepository.findById(id).orElse(null);

        List<Reponses> reponsesFiltered = reponses
                .stream()
                .map(elem -> elem)
                .collect(Collectors.toList());

        return reponsesFiltered.stream()
                .map(reponsesMapper::ToDto)
                .collect(Collectors.toList());
    }

    public List<ReponsesDTO> getAllReponses(){
        return reponsesRepository.findAll()
              .stream()
              .map(reponsesMapper::ToDto)
              .collect(Collectors.toList());

    }

}