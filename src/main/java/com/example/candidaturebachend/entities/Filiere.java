package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFiliere;
    private String intitule;
    @ManyToOne
    private Departement departement;
    @ManyToMany(mappedBy = "filieres",fetch = FetchType.LAZY)
    private List<Candidat> candidats;
    @ManyToOne
    private Diplome diplome;

}