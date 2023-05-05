package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends Utilisateur implements Serializable {
    /*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;*/
    @OneToMany(mappedBy = "admin", fetch = FetchType.LAZY)
    private List<ChefDepartement> chefDepartements;
    @OneToOne(mappedBy = "admin")
    private DirectionPedagogique directionPedagogique;
}