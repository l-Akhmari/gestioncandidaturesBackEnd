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
public class Fichier implements Serializable {
    @Id
    private String idFichier;
    private String chemin;
    @OneToOne(mappedBy = "fichier")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Diplome diplome;
}
