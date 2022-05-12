package com.example.projectbackend.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "questions")
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nomQuestions")
    private String nomQuestion;
    @Column(name = "Questions")
    private String questions;

    @ManyToMany
    @JoinTable(name = "Questions_Theme")
    private Set<Theme> themes = new HashSet<>();

    @OneToMany(mappedBy = "question")
    private Set<Reponses> reponses = new HashSet<>();

    /////////////////////////////////////////////////////////////

    //#region construct

    public Questions() {
    }

    public Questions(String nomQuestion, String questions, Set<Theme> themes, Set<Reponses> reponses) {
        this.nomQuestion = nomQuestion;
        this.questions = questions;
        this.themes = themes;
        this.reponses = reponses;
    }

    public Questions(int id, String nomQuestion, String questions, Set<Theme> themes, Set<Reponses> reponses) {
        this.id = id;
        this.nomQuestion = nomQuestion;
        this.questions = questions;
        this.themes = themes;
        this.reponses = reponses;
    }

    //#endregion

    ///////////////////////////////////////////////////////////////

    //#region getter setter

    public int getIdQuestions() {
        return id;
    }

    public void setIdQuestions(int idQuestions) {
        this.id = idQuestions;
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

    public Set<Theme> getThemes() {
        return themes;
    }

    public void setThemes(Set<Theme> themes) {
        this.themes = themes;
    }

    public Set<Reponses> getReponses() {
        return reponses;
    }

    public void setReponses(Set<Reponses> reponses) {
        this.reponses = reponses;
    }


    //#endregion


}
