package com.homefindertx.homefindertx.controllers;


import com.homefindertx.homefindertx.models.Listing;
import com.homefindertx.homefindertx.models.Zillow;
import com.homefindertx.homefindertx.repositories.ListingRepository;
import com.homefindertx.homefindertx.repositories.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;

import java.io.IOException;

@Controller
class ListingController {

    private ListingRepository listRepo;
    private UserRepository userRepo;

    public ListingController(ListingRepository listRepo, UserRepository userRepo) {
        this.listRepo = listRepo;
        this.userRepo = userRepo;
    }

    @RequestMapping("/")
    public String findAll(Model vModel) {
            vModel.addAttribute("listings", listRepo.findAll());
//        if(user_type = true) {
        return "index";
//        }
//        return"/seller";
    }

    @GetMapping("/{id}")
    public String viewAd(@PathVariable("id") Long id, Model model) {
        Listing listing = listRepo.findOne(id);
        model.addAttribute("listing", listing);
        return "show";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        listRepo.delete(id);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deletePost(@RequestParam(name ="id") long id) {
        listRepo.delete(id);
        return "redirect:/";
    }

    @GetMapping("/create")
    public String showCreateForm(Model vModel){
        vModel.addAttribute("listing", new Listing());
        return "create";
    }

    @PostMapping("/create")
    public String createPost(@ModelAttribute Listing listing){
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        listing.setUser(user);
        listRepo.save(listing);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(Model vModel, @PathVariable long id) {
        vModel.addAttribute("post", listRepo.findOne(id));
        return "/edit";
    }

    @PostMapping("/{id}/edit")
    public String update(@ModelAttribute Listing listing){
        listRepo.save(listing);
        return "redirect:/";
    }

    @GetMapping("/zillow")
    public String showZillow(Zillow zillow, Model vModel) {
        vModel.addAttribute("zillow", zillow);
        return "/zillow";
    }

    @PostMapping("/zillow")
    public String updateZillow(@ModelAttribute Zillow zillow, @RequestParam(name = "address") String address, @RequestParam(name = "citystatezip") String zip) throws IOException, SAXException {
        System.out.println("api:" + Zillow.getZWSID());
        System.out.println(address);
        System.out.println(zip);

        Zillow.getValuation(address, zip);

        System.out.println("valuation:" + Zillow.getValuation(address, zip));
//        System.out.println("info:" + firstResult);
        return "/zillow";
    }
}
