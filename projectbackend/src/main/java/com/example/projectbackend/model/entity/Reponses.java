package com.example.projectbackend.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Reponses")
public class Reponses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomReponse")
    private String nomReponse;

    @ManyToOne
    private Questions question;

    @ManyToOne
    private Patient patient;

    //#region construct

    public Reponses() {
    }

    public Reponses(String nomReponse, Questions question, Patient patient) {
        this.nomReponse = nomReponse;
        this.question = question;
        this.patient = patient;
    }

    public Reponses(int id, String nomReponse, Questions question, Patient patient) {
        this.id = id;
        this.nomReponse = nomReponse;
        this.question = question;
        this.patient = patient;
    }

    //endregion

    //#region getter et setter

    public int getIdReponse() {
        return id;
    }

    public void setIdReponse(int idReponse) {
        this.id = idReponse;
    }

    public String getNomReponse() {
        return nomReponse;
    }

    public void setNomReponse(String nomReponse) {
        this.nomReponse = nomReponse;
    }

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    //endregion
}
