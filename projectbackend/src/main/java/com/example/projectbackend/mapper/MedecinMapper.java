package com.example.projectbackend.mapper;

import com.example.projectbackend.model.dto.MedecinDTO;
import com.example.projectbackend.model.entity.Medecin;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;


@Service
public class MedecinMapper {

    public MedecinDTO ToDto (Medecin medecin ) {
        String lastname = medecin.getLastname();
        String firstname = medecin.getFirstname();
        int id = medecin.getIdMedecins();

        return new MedecinDTO(id, firstname, lastname);
    }

    public Medecin toEntity (MedecinDTO medecinDTO) {
        Medecin entity = new Medecin();
        entity.setFirstname(medecinDTO.getFirstname());
        entity.setLastname(medecinDTO.getLastname());
        entity.setIdMedecins(medecinDTO.getId());

        return entity;
    }


}