package com.homefindertx.homefindertx.controllers;


import com.homefindertx.homefindertx.models.Listing;
import com.homefindertx.homefindertx.repositories.ListingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public String viewAd(@PathVariable("id") Long id, Model model) {
        Listing listing = listRepo.findOne(id);
        model.addAttribute("listing", listing);
        return "/show";
    }



}