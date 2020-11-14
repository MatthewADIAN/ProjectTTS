/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.controllers.profilecontroller;

import com.TTS.ProjectTTS.services.profileservices.AddressService;
import com.TTS.ProjectTTS.entities.Address;
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
@RequestMapping("/address")
@Controller
public class AddressController {

    @Autowired
    AddressService service;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("addressForm", new Address());
        return "address";
    }

    @PostMapping("save")
    public String save(Address address) {
        service.saveAddress(address);
        return "redirect:/address";
    }

    @GetMapping(path="/add")
    public String getById(Model model, @RequestParam String id) {
        model.addAttribute("addressForm", service.getById(id));
        model.addAttribute("address", service.getById(id));
        return "address";
    }
}
