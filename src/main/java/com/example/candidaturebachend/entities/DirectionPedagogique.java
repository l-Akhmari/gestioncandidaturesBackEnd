package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("DPed")

public class DirectionPedagogique extends Utilisateur{
   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/


    @OneToOne
    private Admin admin;

}