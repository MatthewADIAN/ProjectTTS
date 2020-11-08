/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.controllers.profilecontroller;

import com.TTS.ProjectTTS.entities.Education;
import com.TTS.ProjectTTS.services.profileservices.EducationService;
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
@RequestMapping("/education")
@Controller
public class EducationController {
    @Autowired
    EducationService service;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("educationForm", new Education());
        return "education";
    }

    @PostMapping("save")
    public String save(Education education) {
        service.saveEducation(education);
        return "redirect:/education";
    }
    
    @GetMapping("/{id}")
    public String getById(Model model, @PathVariable("id") String id) {
        model.addAttribute("educationForm", new Education());
        model.addAttribute("education", service.getById(id));
        return "education";
    }

}
