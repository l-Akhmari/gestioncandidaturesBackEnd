package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Departement;
import com.example.candidaturebachend.entities.Diplome;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FiliereDto {

    private int idFiliere;
    private String intitule;

    private Departement departement;
    private List<Candidat> candidats;
    private Diplome diplome;

}