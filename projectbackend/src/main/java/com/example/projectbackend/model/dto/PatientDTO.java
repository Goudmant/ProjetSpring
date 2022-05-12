package com.example.projectbackend.model.dto;
import com.example.projectbackend.model.entity.Conseil;
import com.example.projectbackend.model.entity.Reponses;
import com.example.projectbackend.model.entity.Theme;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class PatientDTO {

    private int id;
    private String lastname;
    private String firstname;
    private int phone;
    private String mail;
    @JsonIgnore
    private Set<ThemeDTO> theme = new HashSet<>();
    private Set<Integer> themeIds;


    ////////////////////////////////////////////////////////////////////

    //#region construct

    public PatientDTO() {
    }

    public PatientDTO(String lastname, String firstname, int phone, String mail, Set<ThemeDTO> theme, Set<Integer> themeIds) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.mail = mail;
        this.theme = theme;
        this.themeIds = themeIds;
    }

    public PatientDTO(int id, String lastname, String firstname, int phone, String mail, Set<ThemeDTO> theme, Set<Integer> themeIds) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.phone = phone;
        this.mail = mail;
        this.theme = theme;
        this.themeIds = themeIds;
    }

    //#endregion

    /////////////////////////////////////////////////////////////

    //#region getter setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Set<ThemeDTO> getTheme() {
        return theme;
    }

    public void setTheme(Set<ThemeDTO> theme) {
        this.theme = theme;
    }

    public Set<Integer> getThemeIds() {
        Set<Integer> themeIdList = new HashSet<>();

        for (ThemeDTO t : theme) {
            themeIdList.add(t.getId());
        }

        return themeIdList;
    }


    //endregion

}
