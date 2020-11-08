/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.services.profileservices;

import com.TTS.ProjectTTS.entities.Address;
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
public class AddressService {
    @Autowired
    RestTemplate restTemplate;
    @Value("${api.uri}")
    private String uri;
    
    public Address getById(String id) {
        Address result;
        Map<String, String> param = new HashMap<>();
        param.put("id", id);
        result = restTemplate.getForObject(uri + "/profile/address/{id}", Address.class, param);
        return result;
    }
}
