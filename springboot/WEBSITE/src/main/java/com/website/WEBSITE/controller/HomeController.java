package com.website.WEBSITE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.website.WEBSITE.dto.WebsiteDTO;
import com.website.WEBSITE.models.Website;
import com.website.WEBSITE.service.WebsiteService;

import java.util.List;

@Controller
public class HomeController {

    private final WebsiteService websiteService;

    public HomeController(WebsiteService websiteService) {
        this.websiteService = websiteService;
    }

    @GetMapping({"/", ""})
    public String getAllWebsites(Model model) {
        List<Website> websites = websiteService.getAllWebsites();
        model.addAttribute("websites", websites);
        return "index";
    }

    @GetMapping("/register")
    public String registerWebsite(Model model) {
        WebsiteDTO userDTO = new WebsiteDTO();
        model.addAttribute("userDTO", userDTO);
        return "register_user";
    }

    @PostMapping("/register")
    public String saveWebsite(@ModelAttribute("userDTO") WebsiteDTO userDTO) {
        websiteService.saveWebsite(userDTO);
        return "redirect:/";
    }

    @GetMapping("/edit-website")
    public String editWebsite(@RequestParam Long id, Model model) {
        Website website = websiteService.getWebsite(id);
        WebsiteDTO userDTO = new WebsiteDTO();

        // ✅ Ensure `id` is set
        userDTO.setId(website.getId());
        userDTO.setName(website.getName());
        userDTO.setAge(website.getAge());
        userDTO.setEmail(website.getEmail());
        userDTO.setPhone(website.getPhone());
        userDTO.setPassword(website.getPassword());
        userDTO.setDob(website.getDob());
        userDTO.setCity(website.getCity());
        userDTO.setGender(website.getGender());
        userDTO.setSkills(website.getSkills());
        userDTO.setAddress(website.getAddress());

        model.addAttribute("userDTO", userDTO);
        return "edit_user";
    }

    @PostMapping("/edit-website")
    public String updateWebsite(@ModelAttribute("userDTO") WebsiteDTO userDTO) {
        websiteService.updateWebsite(userDTO, userDTO.getId());
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteWebsite(@RequestParam Long id) {
        websiteService.deleteWebsite(id);
        return "redirect:/";
    }
}
