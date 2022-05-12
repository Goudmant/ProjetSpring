package com.example.projectbackend.mapper;

import com.example.projectbackend.model.dto.ThemeDTO;
import com.example.projectbackend.model.entity.Theme;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.stream.Collectors;

@Service
public class ThemeMapper {

    public ThemeDTO ToTdo (Theme theme){
        ThemeDTO dto = new ThemeDTO();
        dto.setId(theme.getIdThemes());
        dto.setNametheme(theme.getNametheme());
        dto.setCategories(theme.getCategories());

        return dto;
    }
    public Theme toEntity (ThemeDTO themeDTO){
        Theme entity = new Theme();
        entity.setIdThemes(themeDTO.getId());
        entity.setNametheme(themeDTO.getNametheme());
        entity.setCategories(themeDTO.getCategories());

        return entity;
    }

}
