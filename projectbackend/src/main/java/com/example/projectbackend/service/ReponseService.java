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
    private ReponsesRepository reponsesRepository;
    @Autowired
    private ReponsesMapper reponsesMapper;
    @Autowired
    private QuestionsMapper questionsMapper;
    @Autowired
    private QuestionsRepository questionsRepository;

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
    public ReponseDTO addQuestion(int idReponse, int idQuestion){
        Reponses reponses = reponsesRepository.findById(IdReponse).orElse(null);
        Question question = questionsRepository.findById(idQuestion).orElse(null);
        if (reponses != null){
            reponses.getQuestion().add(question);
            return reponsesMapper.ToDto(reponsesRepository.save(reponses));
        }else{
            return null;
        }
    }
}
public List<ReponseDTO> getAllByQuestion(int id){
    List<Reponses> reponses = reponsesRepository.findAll();
    Questions questions = questionsRepository.findById(id).orElse(null);

    Liste<Reponses> reponsesFiltered = reponses
            .stream()
            .filter(elem -> elem.getQuestion().contains(questions))
            .collect(Collectors.toList());

    return reponsesFiltered.stream()
            .map(reponsesMapper::ToDto)
            .collect(Collectors.toList());
}
