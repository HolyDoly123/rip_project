package com.rip.rip_project.controllers;

import com.rip.rip_project.models.User;
import com.rip.rip_project.models.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

/*
Посвящается тем, кто будет писать вьюхи
https://www.thymeleaf.org/doc/tutorials/3.0/thymeleafspring.html
https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html
 */

@Controller
//@RequestMapping(value = "ОБЩИЙ МАРШРУТ", method = {RequestMethod.GET})
public class MainController {

    @Autowired
    private UserRepository userRepository;

    User currentUser;

    @PostConstruct
    public void init() {
        currentUser = userRepository.findByName("Guest");
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("currentUser", currentUser);
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        return "index";
    }

    @PostMapping("/")
    public String loginUser(@ModelAttribute("newUser") User newUser, Model model) {
        if (newUser.getName().isEmpty()) return "index";

        if (userRepository.existsByName(newUser.getName()))
        {
            currentUser = userRepository.findByName(newUser.getName());
            return "redirect:/menu";
        }
        currentUser = newUser;
        currentUser.setAverageScore(0);
        currentUser.setHighestScore(0);
        currentUser.setLastScore(0);
        currentUser.setTotalGames(0);
        userRepository.save(currentUser);
        return "redirect:/menu";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        return "menu";
    }

    @GetMapping("/statistics")
    public String statistics(Model model) {
        return "statistics";
    }

    @GetMapping("/leaderboard")
    public String leaderboard(Model model) {
        return "leaderboard";
    }

    @GetMapping("/play")
    public String play(Model model) {
        return "play";
    }

    @GetMapping("/gameend")
    public String gameend(Model model) {
        return "gameend";
    }
}
