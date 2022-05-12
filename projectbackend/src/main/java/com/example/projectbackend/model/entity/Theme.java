package com.example.projectbackend.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "themes")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nomTheme")
    private String nametheme;

    @Column(name = "catTheme")
    private int categories;

    @ManyToMany(mappedBy = "theme")
    private Set<Patient> patients = new HashSet<>();

    @ManyToMany(mappedBy="themes")
    private Set<Questions> questions = new HashSet<>();

    //////////////////////////////////////////////

    //#region construct

    public Theme() {
    }

    public Theme(String nametheme, int categories, Set<Patient> patients, Set<Questions> questions) {
        this.nametheme = nametheme;
        this.categories = categories;
        this.patients = patients;
        this.questions = questions;
    }

    public Theme(int id, String nametheme, int categories, Set<Patient> patients, Set<Questions> questions) {
        this.id = id;
        this.nametheme = nametheme;
        this.categories = categories;
        this.patients = patients;
        this.questions = questions;
    }

    //endregion

    /////////////////////////////////////////////////////

    //#region getter setter

    public int getIdThemes() {
        return id;
    }

    public void setIdThemes(int idThemes) {
        this.id = idThemes;
    }

    public String getNametheme() {
        return nametheme;
    }

    public void setNametheme(String nametheme) {
        this.nametheme = nametheme;
    }

    public int getCategories() {
        return categories;
    }

    public void setCategories(int categories) {
        this.categories = categories;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public Set<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Questions> questions) {
        this.questions = questions;
    }


    //endregion


}



