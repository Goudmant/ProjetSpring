package com.example.projectbackend.model.dto;

import com.example.projectbackend.model.entity.Patient;
import com.example.projectbackend.model.entity.Questions;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

public class ThemeDTO {

    private int id;

    private String nametheme;

    private int categories;


    ///////////////////////////////////////////////////////////

    //#region construct

    public ThemeDTO() {
    }

    public ThemeDTO(String nametheme, int categories) {
        this.nametheme = nametheme;
        this.categories = categories;
    }

    public ThemeDTO(int id, String nametheme, int categories) {
        this.id = id;
        this.nametheme = nametheme;
        this.categories = categories;
    }

    public static void addALL(ThemeDTO themeDTO) {
    }

    //#endregion

    //////////////////////////////////////////////////////////

    //#region getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


    //#endregion
}
