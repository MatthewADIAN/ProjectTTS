/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.controllers;

import com.TTS.ProjectTTS.services.TtsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import com.TTS.ProjectTTS.entities.Register;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author USER
 */
@Controller
public class TtsController {
    @Autowired
    TtsService service;
    
    @GetMapping("")
    public String index(Model model){
        model.addAttribute("user", new Register());
        return "index";
    }
    
    @PostMapping("register")
    public String save(Register register){
        service.register(register);
        System.out.println(service.register(register));
        return "redirect:/";
    }
}
