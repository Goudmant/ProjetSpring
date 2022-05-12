package com.example.projectbackend.service;

import com.example.projectbackend.mapper.QuestionsMapper;
import com.example.projectbackend.mapper.ThemeMapper;
import com.example.projectbackend.model.dto.QuestionsDTO;
import com.example.projectbackend.model.dto.ThemeDTO;
import com.example.projectbackend.repository.QuestionsRepository;
import com.example.projectbackend.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class QuestionsService {
    @Autowired
    private QuestionsRepository questionsRepository;
    @Autowired
    private QuestionsMapper questionsMapper;

    public QuestionsDTO save (QuestionsDTO questionsDTO){
        return questionsMapper.ToDto(
                questionsRepository.save(questionsMapper.toEntity(questionsDTO))
        );
    }
    public Set<QuestionsDTO> getQuestions(){
        return questionsRepository.findAll()
                .stream()
                .map(questionsMapper::ToDto)
                .collect(Collectors.toSet());
    }
    public QuestionsDTO getQuestionById(int id){
        return questionsMapper.ToDto(
                questionsRepository.findById(id).orElse(null)
        );
    }
    public String deleteQuestion (int id ) {
        questionsRepository.deleteById(id);
        return "Question deleted";
    }
}
