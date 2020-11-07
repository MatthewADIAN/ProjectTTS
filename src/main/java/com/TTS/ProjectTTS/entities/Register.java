/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.entities;

import lombok.Data;

/**
 *
 * @author USER
 */
@Data
public class Register {

    private String birthDate;
    private String currentCompany;
    private String degree;
    private String email;
    private String gender;
    private String job;
    private String major;
    private String name;
    private String password;
    private String phone;
    private String status;
    private String university;
    private String username;

    public Register() {
    }

    public Register(String birthDate, String currentCompany, String degree, String email,
            String gender, String job, String major, String name, String password, String phone,
            String status, String university, String username) {
        this.birthDate = birthDate;
        this.currentCompany = currentCompany;
        this.degree = degree;
        this.email = email;
        this.gender = gender;
        this.job = job;
        this.major = major;
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.status = status;
        this.university = university;
        this.username = username;

    }

}
