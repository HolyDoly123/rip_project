package com.rip.rip_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {
    @GetMapping("/Api")
    public String getApi() {
        RestTemplate restTemplate = new RestTemplate();
        Fact fact = restTemplate.getForObject("https://asli-fun-fact-api.herokuapp.com", Fact.class);
        return fact.toString();
        }
}
