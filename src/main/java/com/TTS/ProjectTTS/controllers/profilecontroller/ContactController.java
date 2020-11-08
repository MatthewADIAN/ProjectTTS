/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.controllers.profilecontroller;

import com.TTS.ProjectTTS.entities.Register;
import com.TTS.ProjectTTS.services.userservices.RegisterService;
import com.TTS.ProjectTTS.entities.Contact;
import com.TTS.ProjectTTS.services.profileservices.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author USER
 */
@RequestMapping("/contact")
@Controller
public class ContactController {
    @Autowired
    ContactService service;
    
    @GetMapping("/{id}")
    public String index(Model model, @PathVariable("id") String id){
        model.addAttribute("contact",service.getById(id));
        return "contact";
    }
    
    /*
    @GetMapping("/{id}")
    public String index(Model model, @PathVariable("id") String id){
        model.addAttribute("contact", service.getById(id));
        return "index";
    }
    */
    /*
    @PostMapping("register")
    public String save(Register register){
        service.register(register);
        System.out.println(service.register(register));
        return "redirect:/";
    }
    */
}
