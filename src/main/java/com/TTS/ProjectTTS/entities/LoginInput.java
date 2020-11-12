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
public class LoginInput {

    private String email;
    private String password;

    public LoginInput() {
    }

    public LoginInput(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
