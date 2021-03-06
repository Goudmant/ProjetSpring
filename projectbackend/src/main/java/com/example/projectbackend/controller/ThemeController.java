package com.example.projectbackend.controller;

import com.example.projectbackend.model.dto.QuestionsDTO;
import com.example.projectbackend.model.dto.ThemeDTO;
import com.example.projectbackend.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
@CrossOrigin
@RestController
@RequestMapping("/theme")
public class ThemeController {

    @Autowired
    private ThemeService themeService;

    @GetMapping
    public Set<ThemeDTO> getThemes(){
        return  themeService.getThemes();}
    @PostMapping
    public ThemeDTO save (@RequestBody ThemeDTO themeDTO) {
        return themeService.save(themeDTO);
    }
}
