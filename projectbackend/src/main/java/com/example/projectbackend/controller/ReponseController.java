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

    @PostMapping
    public ReponsesDTO save (@RequestBody ReponseDTO reponseDTO){
        return reponseService.save(reponseDTO);
    }

    @PutMapping("/Question/{idReponse}")
    public ReponsesDTO addquestions (@PathVariable int idReponses,@RequestParam int id questions){
        return reponseService.addQuestions(idReponses, idQuestions);
    }
    @GetMapping("/reponses/{idQuestion}")
    public List<ReponsesDTO> getAllByQuestions (@PathVariable int idQuestions){
        return ReponseService.getAllByQuestions(idQuestions);
    }
    ////////////////////////////////////////
    //TODO à verifier une liste de toutes les reponses lié a question
    @PostMapping
    public Set<Reponses> findAllReponse(){
        return Questions.createQuery(Reponses.class).getQuestionsSet();
    }
    //////////////////////////////////////////
}
