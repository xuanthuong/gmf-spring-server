package com.dounets.web.modules.home.controllers;

import com.dounets.web.modules.home.models.User;
import com.dounets.web.modules.home.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/demo", method = RequestMethod.GET)
public class MainController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/add")
    @ResponseBody
    public String addNewUser(@RequestParam String name, @RequestParam String email) {

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return email;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<User> getAllUsers() {

        return userRepository.findAll();
    }
}
