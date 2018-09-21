package com.homefindertx.homefindertx.controllers;

import com.homefindertx.homefindertx.models.User;
import com.homefindertx.homefindertx.repositories.ListingRepository;
import com.homefindertx.homefindertx.repositories.UserRepository;
import com.homefindertx.homefindertx.services.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private UserRepository userDao;
    private PasswordEncoder passwordEncoder;
    private ListingRepository listDao;
    private UserService userSvc;


    public UserController(UserRepository userDao, ListingRepository listDao, PasswordEncoder passwordEncoder, UserService userSvc) {

        this.userDao = userDao;
        this.listDao = listDao;
        this.passwordEncoder = passwordEncoder;
        this.userSvc = userSvc;
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
    public String buyerPage(Model vModel) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User curruser = userDao.findByUsername(user.getUsername());

        vModel.addAttribute("user", curruser);
        return"profile";
    }

    @GetMapping("/sellerprofile")
    public String sellerPage(Model vModel) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User curruser = userDao.findByUsername(user.getUsername());
//        User listings = listDao.findAll(user.getId());
        vModel.addAttribute("user", curruser);
        return "sellerprofile";
    }

    @GetMapping("/register")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "register";
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
        return "editprofile";
    }

    @PostMapping("profile/{id}/edit")
    public String update(@ModelAttribute User user){
        userDao.save(user);
        userSvc.authenticate(user);
        return "redirect:/profile";
    }
    @GetMapping("sellerprofile/{id}/edit")
    public String showSellerEditForm(Model vModel, @PathVariable long id) {
        vModel.addAttribute("user", userDao.findOne(id));
        return "seller-edit-profile";
    }

    @PostMapping("sellerprofile/{id}/edit")
    public String sellerUpdate(@ModelAttribute User user){
        userDao.save(user);
        userSvc.authenticate(user);
        return "redirect:/sellerprofile";
    }
}
