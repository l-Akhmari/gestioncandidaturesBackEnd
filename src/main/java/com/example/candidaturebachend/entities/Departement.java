package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartement;
    private String intitule;
    @OneToOne(mappedBy = "departement")
    private ChefDepartement chefDepartement;
    @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY)
    private List<Filiere> filieres;
}
