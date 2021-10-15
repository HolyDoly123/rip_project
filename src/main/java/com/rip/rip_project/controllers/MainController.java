package com.rip.rip_project.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping(value = "ОБЩИЙ МАРШРУТ", method = {RequestMethod.GET})
public class MainController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
