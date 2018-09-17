package com.homefindertx.homefindertx.controllers;


import com.homefindertx.homefindertx.repositories.ListingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class ListingController {

    private ListingRepository listRepo;

    public ListingController(ListingRepository listRepo) {
        this.listRepo = listRepo;
    }

    @RequestMapping("/")
    public String findAll(Model vModel) {
        vModel.addAttribute("listings", listRepo.findAll());
        return"/index";
    }



}