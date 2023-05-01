package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DirectionPedagogique extends Utilisateur{
   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/

    private int idDirectioPedagogique;
    @OneToOne(mappedBy = "directionPedagogique")
    private Admin admin;

}