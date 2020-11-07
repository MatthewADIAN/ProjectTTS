package com.TTS.ProjectTTS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
}
