package com.example.projectbackend.repository;

import com.example.projectbackend.model.entity.Questions;
import com.example.projectbackend.model.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface QuestionsRepository extends JpaRepository<Questions, Integer>{
    // Questions findByName (String name);
}
