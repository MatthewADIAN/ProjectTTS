/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.controllers.profilecontroller;

import com.TTS.ProjectTTS.services.profileservices.CurrentOccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author USER
 */
@RequestMapping("/currentoccupation")
@Controller
public class CurrentOccupationController {
    @Autowired
    CurrentOccupationService service;

    @GetMapping("/{id}")
    public String index(Model model, @PathVariable("id") String id) {
        model.addAttribute("occupation", service.getById(id));
        return "currentoccupation";
    }
}
