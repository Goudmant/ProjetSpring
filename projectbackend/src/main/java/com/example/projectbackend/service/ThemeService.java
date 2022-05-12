package com.example.projectbackend.service;

import com.example.projectbackend.mapper.ThemeMapper;
import com.example.projectbackend.model.dto.ThemeDTO;
import com.example.projectbackend.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ThemeService {
    @Autowired
    private ThemeRepository themeRepository;
    @Autowired
    private ThemeMapper themeMapper;

    public ThemeDTO save(ThemeDTO themeDTO){
        return themeMapper.ToTdo(
                themeRepository.save(themeMapper.toEntity(themeDTO))
        );
    }
    public Set<ThemeDTO> getThemes(){
        return themeRepository.findAll()
                .stream()
                .map(themeMapper::ToTdo)
                .collect(Collectors.toSet());
    }
    public ThemeDTO getThemeById(int id) {
        return themeMapper.ToTdo(
                themeRepository.findById(id).orElse(null)
        );
    }
        public String deleteTheme (int id ) {
            themeRepository.deleteById(id);
            return "Theme deleted";
        }
}
