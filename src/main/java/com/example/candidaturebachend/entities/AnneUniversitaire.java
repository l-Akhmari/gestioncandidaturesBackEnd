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
public class AnneUniversitaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnne;
    private String anneUniv;
    @ManyToMany
    //@JoinTable(name = "Archieve")
    List<Candidat> candidats;
}