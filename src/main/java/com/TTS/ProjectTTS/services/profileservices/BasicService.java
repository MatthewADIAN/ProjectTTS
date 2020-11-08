/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.services.profileservices;

import com.TTS.ProjectTTS.entities.Basic;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author USER
 */
@Service
public class BasicService {
    @Autowired
    RestTemplate restTemplate;
    @Value("${api.uri}")
    private String uri;
    
    public Basic getById(String id) {
        Basic result;
        Map<String, String> param = new HashMap<>();
        param.put("id", id);
        result = restTemplate.getForObject(uri + "/profile/basic/{id}", Basic.class, param);
        return result;
    }
}
