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
public class Contact {

    private String facebook;
    private String id;
    private String instagram;
    private String linkedin;
    private String phone;

    public Contact() {
    }

    public Contact(String facebook, String id, String instagram, String linkedin, String phone) {
        this.facebook = facebook;
        this.id = id;
        this.instagram = instagram;
        this.linkedin = linkedin;
        this.phone = phone;
    }
}
