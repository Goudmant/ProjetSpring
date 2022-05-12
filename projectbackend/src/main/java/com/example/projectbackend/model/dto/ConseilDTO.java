package com.example.projectbackend.model.dto;

import com.example.projectbackend.model.entity.Medecin;
import com.example.projectbackend.model.entity.Patient;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

public class ConseilDTO {

    private int id;
    private String leConseil;
    @JsonIgnore
    private MedecinDTO medecin;
    private int medecinId;
    @JsonIgnore
    private PatientDTO patient;
    private int patientId;

    ///////////////////////////////////////////////

    //#region constructor

    public ConseilDTO() {
    }

    public ConseilDTO(String leConseil, MedecinDTO medecin, PatientDTO patient) {
        this.leConseil = leConseil;
        this.medecin = medecin;
        this.patient = patient;
    }

    public ConseilDTO(int id, String leConseil, MedecinDTO medecin, PatientDTO patient) {
        this.id = id;
        this.leConseil = leConseil;
        this.medecin = medecin;
        this.patient = patient;
    }
    //#enregion


    ///////////////////////////////////////////////

    //#region getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeConseil() {
        return leConseil;
    }

    public void setLeConseil(String leConseil) {
        this.leConseil = leConseil;
    }

    public MedecinDTO getMedecin() {
        return medecin;
    }

    public void setMedecin(MedecinDTO medecin) {
        this.medecin = medecin;
    }

    public PatientDTO getPatient() {
        return patient;
    }

    public void setPatient(PatientDTO patient) {
        this.patient = patient;
    }

    public int getMedecinId() {
        return medecin.getId();
    }

    public int getPatientId() {
        return patient.getId();
    }

    //#enregion
}
