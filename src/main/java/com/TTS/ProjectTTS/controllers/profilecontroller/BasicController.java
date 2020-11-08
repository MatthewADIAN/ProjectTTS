/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.controllers.profilecontroller;

import com.TTS.ProjectTTS.entities.Basic;
import com.TTS.ProjectTTS.services.profileservices.BasicService;
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
@RequestMapping("/basic")
@Controller
public class BasicController {
    @Autowired
    BasicService service;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("basicForm", new Basic());
        return "basic";
    }
    
    @PostMapping("save")
    public String save(Basic basic) {
        service.saveBasic(basic);
        return "redirect:/basic";
    }
    
    
    @GetMapping("/{id}")
    public String getById(Model model, @PathVariable("id") String id) {
        model.addAttribute("basicForm", new Basic());
        model.addAttribute("basic", service.getById(id));
        return "basic";
    }

}
