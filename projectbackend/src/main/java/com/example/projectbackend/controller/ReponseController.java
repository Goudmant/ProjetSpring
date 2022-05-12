package com.example.projectbackend.controller;

import com.example.projectbackend.model.entity.Questions;
import com.example.projectbackend.model.entity.Reponses;
import com.example.projectbackend.service.ReponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/reponse")
public class ReponseController {
    @Autowired
    private ReponseService reponseService;

    ////////////////////////////////////////
    //TODO à verifier une liste de toutes les reponses lié a question
//    @PostMapping
//    public Set<Reponses> findAllReponse(){
//        return Questions.createQuery(Reponses.class).getQuestionsSet();
//    }
    //////////////////////////////////////////
}
