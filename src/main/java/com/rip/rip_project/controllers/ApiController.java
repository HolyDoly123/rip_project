package com.rip.rip_project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/Api")
    public String getApi() {
        return "Api here";
    }
}

