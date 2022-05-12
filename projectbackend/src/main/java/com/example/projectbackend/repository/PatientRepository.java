package com.example.projectbackend.repository;

import com.example.projectbackend.model.entity.Patient;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    // Patient findByName(String name);

}
