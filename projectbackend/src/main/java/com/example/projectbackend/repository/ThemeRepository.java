package com.example.projectbackend.repository;

import com.example.projectbackend.model.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ThemeRepository extends JpaRepository<Theme, Integer> {
    // Theme findByName (String name );

}
