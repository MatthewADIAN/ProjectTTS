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
public class CurrentOccupation {

    private String website;
    private String currentCompany;
    private String id;
    private String job;
    

    public CurrentOccupation() {
    }

    public CurrentOccupation(String website, String currentCompany, String id, String job) {
        this.website = website;
        this.currentCompany = currentCompany;
        this.id = id;
        this.job = job;
    }
}
