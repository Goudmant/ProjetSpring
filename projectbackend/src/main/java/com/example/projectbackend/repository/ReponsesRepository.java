package com.example.projectbackend.repository;

import com.example.projectbackend.model.entity.Reponses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReponsesRepository extends JpaRepository<Reponses, Integer> {
    // TypeDeQuestions findByName (String name);

}
