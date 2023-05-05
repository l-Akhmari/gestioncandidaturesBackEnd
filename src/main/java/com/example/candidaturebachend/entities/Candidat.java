package com.example.candidaturebachend.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Candidat extends Utilisateur implements Serializable {
   /* @Id
    private String idCandidat;*/
    private String cne;
    private String ville;
    private boolean admis;
    @ManyToMany
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Filiere> filieres;
    @ManyToMany(mappedBy = "candidats",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<AnneUniversitaire> anneUniversitaires;
    @OneToMany(mappedBy = "candidat",fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Diplome> diplomes;

}
