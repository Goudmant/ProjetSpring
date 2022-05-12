package com.example.projectbackend.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "lastName")
    private String lastname;

    @Column(name = "firstName")
    private String firstname;

    @Column(name = "phoneNumber" )
    private int phone;

    @Column(name = "mail")
    private String mail;

    @OneToMany(mappedBy = "patient")
    private Set<Reponses> reponses = new HashSet<>();

    @OneToMany(mappedBy = "patient")
    private Set<Conseil> conseils = new HashSet<>();

    @ManyToMany
    @JoinTable (
            name = "PatientChoixTheme"
    )
    private Set<Theme> theme = new HashSet<>();

    ////////////////////////////////////////////////////////////

    //#region construct

    public Patient() {
    }

    public Patient(String lastname, String firstname, int phone, String mail, Set<Reponses> reponses, Set<Conseil> conseils, Set<Theme> theme) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.mail = mail;
        this.reponses = reponses;
        this.conseils = conseils;
        this.theme = theme;
    }

    public Patient(int id, String lastname, String firstname, int phone, String mail, Set<Reponses> reponses, Set<Conseil> conseils, Set<Theme> theme) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.mail = mail;
        this.reponses = reponses;
        this.conseils = conseils;
        this.theme = theme;
    }

    //#endregion

    ////////////////////////////////////////////////////////////////

    //#region getter et setter

    public int getIdPatients() {
        return id;
    }

    public void setIdPatients(int idPatients) {
        this.id = idPatients;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Set<Reponses> getReponses() {
        return reponses;
    }

    public void setReponses(Set<Reponses> reponses) {
        this.reponses = reponses;
    }

    public Set<Conseil> getConseils() {
        return conseils;
    }

    public void setConseils(Set<Conseil> conseils) {
        this.conseils = conseils;
    }

    public Set<Theme> getTheme() {
        return theme;
    }

    public void setTheme(Set<Theme> theme) {
        this.theme = theme;
    }


    //#endregion
}
