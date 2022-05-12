package com.example.projectbackend.mapper;

import com.example.projectbackend.model.dto.QuestionsDTO;
import com.example.projectbackend.model.entity.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class QuestionsMapper {

    @Autowired
    private ThemeMapper themeMapper;

    public QuestionsDTO ToDto (Questions questions){
        if (questions == null) {
            return null;
        }

        QuestionsDTO dto = new QuestionsDTO();
        dto.setId(questions.getIdQuestions());
        dto.setNomQuestion(questions.getNomQuestion());
        dto.setQuestions(questions.getQuestions());
        dto.setThemes(questions.getThemes()
                .stream()
                .map(themeMapper::ToTdo)
                .collect(Collectors.toSet()));

        System.out.println(dto.getNomQuestion());

        return dto;
    }
    public Questions toEntity (QuestionsDTO questionsDTO){
        Questions entity = new Questions();
        entity.setIdQuestions(questionsDTO.getId());
        entity.setNomQuestion(questionsDTO.getNomQuestion());
        entity.setQuestions(questionsDTO.getQuestions());
        entity.setThemes(questionsDTO.getThemes()
                .stream()
                .map(themeMapper::toEntity)
                .collect(Collectors.toSet()));

        return entity;
    }
}
