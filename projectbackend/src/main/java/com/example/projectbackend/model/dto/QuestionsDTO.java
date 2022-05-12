package com.example.projectbackend.model.dto;

import com.example.projectbackend.model.entity.Reponses;
import com.example.projectbackend.model.entity.Theme;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class QuestionsDTO {

    private int id;

    private String nomQuestion;

    private String questions;

    private Set<ThemeDTO> themes = new HashSet<>();

    ////////////////////////////////////////////////////////////

    //#region constructor

    public QuestionsDTO() {
    }

    public QuestionsDTO(String nomQuestion, String questions, Set<ThemeDTO> themes) {
        this.nomQuestion = nomQuestion;
        this.questions = questions;
        this.themes = themes;
    }

    public QuestionsDTO(int id, String nomQuestion, String questions, Set<ThemeDTO> themes) {
        this.id = id;
        this.nomQuestion = nomQuestion;
        this.questions = questions;
        this.themes = themes;
    }

    //#endregion

    ////////////////////////////////////////////////////////////

    //#region getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomQuestion() {
        return nomQuestion;
    }

    public void setNomQuestion(String nomQuestion) {
        this.nomQuestion = nomQuestion;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public Set<ThemeDTO> getThemes() {
        return themes;
    }

    public void setThemes(Set<ThemeDTO> themes) {
        this.themes = themes;
    }


    //#endregion
}
