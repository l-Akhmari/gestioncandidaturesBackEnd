package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ChefDepartement extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChefDep;
    private String matricule;
    @OneToOne
    private Departement departement;
    @ManyToOne
    private Admin admin;
}
