package com.example.candidaturebachend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("DPed")

public class DirectionPedagogique extends Utilisateur implements Serializable {
   /* @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDirectioPedagogique;
    @OneToOne(mappedBy = "directionPedagogique")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Admin admin;

}