package com.example.projectbackend.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "medecins")
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstName")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @OneToMany(mappedBy = "medecin")
    private Set<Conseil> conseils = new HashSet<>();


    ///////////////////////////////////////////////

    //#region construct

    public Medecin() {
    }

    public Medecin(String firstname, String lastname, Set<Conseil> conseils) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.conseils = conseils;
    }

    public Medecin(int id, String firstname, String lastname, Set<Conseil> conseils) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.conseils = conseils;
    }

    //#endregion

    ///////////////////////////////////////////////

    //#region getter setter

    public int getIdMedecins() {
        return id;
    }

    public void setIdMedecins(int idMedecins) {
        this.id = idMedecins;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Conseil> getConseils() {
        return conseils;
    }

    public void setConseils(Set<Conseil> conseils) {
        this.conseils = conseils;
    }


    //#endregion



}
