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
public class Basic {
    private String id;
    private String name;
    private String birthDate;
    private String gender;
    private String email;
    
    public Basic() {
    }

    public Basic(String id, String name, String birthDate, String gender, String email) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
    }
}
