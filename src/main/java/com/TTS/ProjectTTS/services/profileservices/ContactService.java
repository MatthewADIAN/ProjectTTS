/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.services.profileservices;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.TTS.ProjectTTS.entities.Contact;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.client.RestClientException;
/**
 *
 * @author USER
 */
@Service
public class ContactService {

    @Autowired
    RestTemplate restTemplate;
    @Value("${api.uri}")
    private String uri;
    
    public Contact getById(String id) {
        Contact result;
        Map<String, String> param = new HashMap<>();
        param.put("id", id);
        result = restTemplate.getForObject(uri + "/profile/contact/{id}", Contact.class, param);
        return result;
    }
    
    public boolean saveContact(Contact contact) {
        boolean result = true;
        try {
            restTemplate.postForObject(uri + "/profile/contact", contact, Contact.class);
        } catch (Exception e) {
            result = false;
        }
        return result;
    }

}
