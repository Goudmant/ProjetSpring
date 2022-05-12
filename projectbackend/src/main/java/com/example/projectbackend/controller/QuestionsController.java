package com.example.projectbackend.controller;

import com.example.projectbackend.model.dto.QuestionsDTO;
import com.example.projectbackend.model.dto.ThemeDTO;
import com.example.projectbackend.model.entity.Questions;
import com.example.projectbackend.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/question")
public class QuestionsController  {
    @Autowired
    private QuestionsService questionsService;

    @PostMapping
    public QuestionsDTO save(@RequestBody QuestionsDTO questionsDTO) {
        return questionsService.save(questionsDTO);
    }

    // http://localhost:8080/question/theme/2?idTheme=1
    @PutMapping("/theme/{idQuestion}")
    public QuestionsDTO addTheme(@PathVariable int idQuestion, @RequestParam int idTheme) {
        return questionsService.addTheme(idQuestion, idTheme);
    }
    @GetMapping("/theme/{idTheme}")
    public List<QuestionsDTO> getAllByTheme (@PathVariable int idTheme){
        return questionsService.getAllByTheme(idTheme);
    }

}
