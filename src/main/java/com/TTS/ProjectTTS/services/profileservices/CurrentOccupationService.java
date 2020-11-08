/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.services.profileservices;

import com.TTS.ProjectTTS.entities.CurrentOccupation;
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
public class CurrentOccupationService {
    @Autowired
    RestTemplate restTemplate;
    @Value("${api.uri}")
    private String uri;
    
    public CurrentOccupation getById(String id) {
        CurrentOccupation result;
        Map<String, String> param = new HashMap<>();
        param.put("id", id);
        result = restTemplate.getForObject(uri + "/profile/currentoccupation/{id}", 
                CurrentOccupation.class, param);
        return result;
    }
    
    public boolean saveOccupation(CurrentOccupation occupation) {
        boolean result = true;
        try {
            restTemplate.postForObject(uri + "/profile/currentoccupation", occupation
                    , CurrentOccupation.class);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }
}
