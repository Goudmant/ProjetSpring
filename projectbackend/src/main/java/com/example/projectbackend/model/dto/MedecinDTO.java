package com.example.projectbackend.model.dto;

import com.example.projectbackend.model.entity.Conseil;

import javax.persistence.*;
import java.util.Set;

public class MedecinDTO {

    private int id;
    private String firstname;
    private String lastname;

    ///////////////////////////////////////////////

    //#region construct

    public MedecinDTO() {
    }

    public MedecinDTO(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public MedecinDTO(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    //#endregion

    ///////////////////////////////////////////////

    //#region getter setter


    public int getId() {
        return id;
    }

    public void setId(int id) {this.id = id;}

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


    //#endregion

}
