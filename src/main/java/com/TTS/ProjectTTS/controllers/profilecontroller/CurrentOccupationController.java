/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.controllers.profilecontroller;

import com.TTS.ProjectTTS.entities.CurrentOccupation;
import com.TTS.ProjectTTS.services.profileservices.CurrentOccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author USER
 */
@RequestMapping("/currentoccupation")
@Controller
public class CurrentOccupationController {
    @Autowired
    CurrentOccupationService service;


    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("occupationForm", new CurrentOccupation());
        return "currentoccupation";
    }

    @PostMapping("save")
    public String save(CurrentOccupation occupation) {
        service.saveOccupation(occupation);
        return "redirect:/currentoccupation";
    }
    
    @GetMapping(path="/get")
    public String getById(Model model, @RequestParam String id) {
        model.addAttribute("occupationForm", service.getById(id));
        model.addAttribute("occupation", service.getById(id));
        return "currentoccupation";
    }
}
