/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.TTS.ProjectTTS.controllers.usercontroller;

import com.TTS.ProjectTTS.entities.LoginInput;
import com.TTS.ProjectTTS.services.userservices.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author USER
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService service;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("loginForm", new LoginInput());
        return "login";
    }

    @PostMapping("loginCheck")
    public String loginStart(Model model, LoginInput input) {
        model.addAttribute("loginForm", new LoginInput());
        model.addAttribute("loginResult", service.login(input));
        return "login";
    }

}
