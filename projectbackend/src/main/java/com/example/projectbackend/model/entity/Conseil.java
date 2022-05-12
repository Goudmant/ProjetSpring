package com.example.projectbackend.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "conseils")
public class Conseil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "leConseil")
    private String leConseil;

    @ManyToOne
    private Medecin medecin;

    @ManyToOne
    private Patient patient;

    /////////////////////////////////////////////////////////

    //#region construct

    public Conseil() {
    }

    public Conseil(String leconseil, Medecin medecins, Patient patients) {
        this.leConseil = leconseil;
        this.medecin = medecins;
        this.patient = patients;
    }

    public Conseil(int id, String leconseil, Medecin medecins, Patient patients) {
        this.id = id;
        this.leConseil = leconseil;
        this.medecin = medecins;
        this.patient = patients;
    }

    //#endregion

    //////////////////////////////////////////////

    //#region getter setter

    public int getIdConseils() {
        return id;
    }

    public void setIdConseils(int idConseils) {
        this.id = idConseils;
    }

    public String getLeConseil() {
        return leConseil;
    }

    public void setLeConseil(String leConseil) {
        this.leConseil = leConseil;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    //#endregion
}
