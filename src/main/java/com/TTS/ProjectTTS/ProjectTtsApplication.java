package com.TTS.ProjectTTS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProjectTtsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectTtsApplication.class, args);
        System.out.println("Program is running");
    }

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /*
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
     */
}
