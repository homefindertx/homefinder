package com.homefindertx.homefindertx.controllers;

import com.homefindertx.homefindertx.models.User;
import com.homefindertx.homefindertx.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private UserRepository userDao;


    public UserController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping(value="/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String saveUser(@RequestParam(name = "user_type") boolean type, @ModelAttribute User user){
        System.out.println(type);
        user.setUser_type(type);
        userDao.save(user);
        return "redirect:/login";
    }

    @GetMapping("profile/{id}/edit")
    public String showEditForm(Model vModel, @PathVariable long id) {
        vModel.addAttribute("user", userDao.findOne(id));
        return "profile/edit";
    }

    @PostMapping("profile/{id}/edit")
    public String update(@ModelAttribute User user){
        userDao.save(user);
        return "redirect:/profile";
    }
}
