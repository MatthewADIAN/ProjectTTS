/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.services.userservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.TTS.ProjectTTS.entities.Register;

/**
 *
 * @author USER
 */
@Service
public class RegisterService {

    @Autowired
    RestTemplate restTemplate;
    @Value("${api.uri}")
    private String uri;

    public boolean register(Register register) {
        boolean result = true;
        try {
            restTemplate.postForObject(uri + "/register", register, Register.class);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }
}
