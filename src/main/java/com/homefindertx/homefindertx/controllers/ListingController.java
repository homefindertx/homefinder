package com.homefindertx.homefindertx.controllers;


import com.homefindertx.homefindertx.repositories.ListingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ListingController {
    private final ListingRepository listingDao;

    public ListingController(ListingRepository listingDao) {
        this.listingDao = listingDao;
    }

    @GetMapping("/listings")
    public String index(Model model) {
        model.addAttribute("listings", listingDao.findAll());
        return "listings/index";
    }


}