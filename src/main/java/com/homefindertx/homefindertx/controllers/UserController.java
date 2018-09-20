package com.homefindertx.homefindertx.controllers;

import com.homefindertx.homefindertx.models.User;
import com.homefindertx.homefindertx.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private UserRepository userDao;
    private PasswordEncoder passwordEncoder;


    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder) {

        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/user-type")
    public String userType() {

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(user.getIsBuyer()) {
            return "redirect:/profile";
        }
        return"redirect:/sellerprofile";

    }

    @GetMapping("/profile")
    public String buyerPage() {
        return"profile";
    }

    @GetMapping("/sellerprofile")
    public String sellerPage(Model vModel) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User curruser = userDao.findByUsername(user.getUsername());
        vModel.addAttribute("user", curruser);
        return "sellerprofile";
    }

    @GetMapping("/register")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "/register";
    }

    @PostMapping("/register")
    public String saveUser(@RequestParam(name = "user_type") Boolean type,  @ModelAttribute User user){

        System.out.println(type);
        user.setIsBuyer(type);
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
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
        return "redirect:/profile/edit";
    }
}
