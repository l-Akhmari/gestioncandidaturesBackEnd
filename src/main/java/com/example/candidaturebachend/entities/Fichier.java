package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fichier {
    @Id
    private String idFichier;
    private String chemin;
    @OneToOne
    private Diplome diplome;
}
