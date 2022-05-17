package com.example.projectbackend.model.dto;

import com.example.projectbackend.model.entity.Patient;
import com.example.projectbackend.model.entity.Questions;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;
import java.util.stream.Collectors;

public class ReponsesDTO {

    private int id;

    private String nomReponse;

    private QuestionsDTO question;

    @JsonIgnore
    private PatientDTO patient;

    private int patientId;


    //////////////////////////////////////////////

    //#region construct

    public ReponsesDTO() {
    }

    public ReponsesDTO(String nomReponse, QuestionsDTO question, PatientDTO patient, int patientId) {
        this.nomReponse = nomReponse;
        this.question = question;
        this.patient = patient;
        this.patientId = patientId;
    }

    public ReponsesDTO(int id, String nomReponse, QuestionsDTO question, PatientDTO patient, int patientId) {
        this.id = id;
        this.nomReponse = nomReponse;
        this.question = question;
        this.patient = patient;
        this.patientId = patientId;
    }

    //#endregion

    /////////////////////////////////////////////

    //#region getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomReponse() {
        return nomReponse;
    }

    public void setNomReponse(String nomReponse) {
        this.nomReponse = nomReponse;
    }

    public QuestionsDTO getQuestion() {
        return question;
    }

    public void setQuestion(QuestionsDTO question) {
        this.question = question;
    }

    public PatientDTO getPatient() {
        return patient;
    }

    public void setPatient(PatientDTO patient) {
        this.patient = patient;
    }

    public int getPatientId() {
        return patient.getId();
    }

    //#endregion

}
