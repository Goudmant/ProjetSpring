package com.example.projectbackend.mapper;

import com.example.projectbackend.model.dto.ConseilDTO;
import com.example.projectbackend.model.entity.Conseil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConseilMapper {

    @Autowired
    private MedecinMapper medecinMapper;
    @Autowired
    private PatientMapper patientMapper;

    public ConseilDTO ToDto (Conseil conseil) {
        ConseilDTO dto = new ConseilDTO();
        dto.setId(dto.getId());
        dto.setLeConseil(dto.getLeConseil());
        dto.setMedecin(medecinMapper.ToDto(conseil.getMedecin()));
        dto.setPatient(patientMapper.ToDto(conseil.getPatient()));

        return dto;
    }

    public Conseil ToEntity(ConseilDTO conseilDTO){
        Conseil entity = new Conseil();
        entity.setIdConseils(conseilDTO.getId());
        entity.setLeConseil(conseilDTO.getLeConseil());
        entity.setMedecin(medecinMapper.toEntity(conseilDTO.getMedecin()));
        entity.setPatient(patientMapper.toEntity(conseilDTO.getPatient()));

        return entity;
    }
}
