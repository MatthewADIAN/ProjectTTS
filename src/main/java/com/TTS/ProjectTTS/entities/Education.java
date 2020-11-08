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
public class Education {

    private String major;
    private String university;
    private String degree;
    private String id;
    private String status;

    public Education() {
    }

    public Education(String major, String university, String degree, String id, String status) {
        this.major = major;
        this.university = university;
        this.degree = degree;
        this.id = id;
        this.status = status;

    }
}
