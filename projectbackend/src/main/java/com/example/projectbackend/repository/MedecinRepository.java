package com.example.projectbackend.repository;

import com.example.projectbackend.model.entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Integer> {
    // Medecin findByName(String name );

}
