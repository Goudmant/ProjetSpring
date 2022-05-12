package com.example.projectbackend.repository;

import com.example.projectbackend.model.entity.Conseil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ConseilRepository extends JpaRepository<Conseil, Integer> {
//    Conseil finByName(String name);

}
