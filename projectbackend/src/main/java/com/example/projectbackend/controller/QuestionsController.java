package com.example.projectbackend.controller;

import com.example.projectbackend.model.dto.QuestionsDTO;
import com.example.projectbackend.model.dto.ThemeDTO;
import com.example.projectbackend.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/question")
public class QuestionsController {
    @Autowired
    private QuestionsService questionsService;

    @PostMapping
    public QuestionsDTO save(@RequestBody QuestionsDTO questionsDTO) {
        return questionsService.save(questionsDTO);
    }


}
