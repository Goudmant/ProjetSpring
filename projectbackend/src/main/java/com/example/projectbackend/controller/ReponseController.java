package com.example.projectbackend.controller;

import com.example.projectbackend.model.dto.ReponsesDTO;
import com.example.projectbackend.model.entity.Questions;
import com.example.projectbackend.model.entity.Reponses;
import com.example.projectbackend.service.ReponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
@CrossOrigin
@RestController
@RequestMapping("/reponse")
public class ReponseController {
    @Autowired
    private ReponseService reponseService;

    @PostMapping("{idQuestion}/{idPatient}")
    public ReponsesDTO save (@RequestBody ReponsesDTO reponseDTO, @PathVariable int idQuestion, @PathVariable int idPatient){
        return reponseService.save(reponseDTO, idQuestion, idPatient);
    }

    @GetMapping("{idQuestion}")
    public List<ReponsesDTO> getAllByQuestions (@PathVariable int idQuestions){
        return reponseService.getAllByQuestion(idQuestions);
    }

    @GetMapping
    public List<ReponsesDTO> getFindAllReponses(){
        return reponseService.getAllReponses();
    }

}
