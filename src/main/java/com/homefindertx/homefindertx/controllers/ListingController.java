package com.homefindertx.homefindertx.controllers;


import com.homefindertx.homefindertx.models.Listing;
import com.homefindertx.homefindertx.models.User;
import com.homefindertx.homefindertx.repositories.ListingRepository;
import com.homefindertx.homefindertx.repositories.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
class ListingController {

    private ListingRepository listRepo;
    private UserRepository userRepo;



    public ListingController(ListingRepository listRepo, UserRepository userRepo) {
        this.listRepo = listRepo;
        this.userRepo = userRepo;
    }

    @GetMapping("/index")
    public String FindAll(Model vModel) {

        vModel.addAttribute("listings", listRepo.findAll());
        return"index";
    }

    @GetMapping("show/{id}")
    public String viewAd(@PathVariable("id") Long id, Model model) {
        Listing listing = listRepo.findOne(id);
        model.addAttribute("listing", listing);
        return "show";
    }

    @RequestMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        listRepo.delete(id);
        return "redirect:/sellerprofile";
    }

    @PostMapping("/delete")
    public String deletePost(@RequestParam(name ="id") long id) {
        listRepo.delete(id);
        return "redirect:/sellerprofile";
    }

    @GetMapping("/create")
    public String showCreateForm(Model vModel){
        vModel.addAttribute("listing", new Listing());
        return "create";
    }

    @PostMapping("/create")
    public String createPost(@ModelAttribute Listing listing){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        listing.setUser(user);
        listRepo.save(listing);
        return "redirect:/sellerprofile";
    }

    @GetMapping("/{id}/edit")
    public String showEditForm(Model vModel, @PathVariable long id) {
        vModel.addAttribute("listing", listRepo.findOne(id));
        return "editlisting";
    }

    @PostMapping("/{id}/edit")
    public String update(@ModelAttribute Listing listing){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        listing.setUser(user);
        listRepo.save(listing);
        return "redirect:/sellerprofile";
    }

//    @RequestMapping(value = "/search", method = RequestMethod.GET)
//    public String search(@RequestParam(value = "search", required = false) String q, Model model) {
//        List<Listing> searchResults = null;
//        try {
////            searchResults = List <Listing> listings;
//
//        } catch (Exception ex) {
//            // here you should handle unexpected errors
//            // ...
//            // throw ex;
//        }
//        model.addAttribute("search", searchResults);
//        return "index/";
//
//    }

}
