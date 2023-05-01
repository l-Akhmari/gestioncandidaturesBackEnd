package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidat extends Utilisateur{
   /* @Id
    private String idCandidat;*/
    private String cne;
    private String ville;
    private boolean admis;
    @ManyToMany
    private List<Filiere> filieres;
    @ManyToMany(mappedBy = "candidats",fetch = FetchType.LAZY)
    private List<AnneUniversitaire> anneUniversitaires;
    @OneToMany(mappedBy = "candidat",fetch = FetchType.LAZY)
    private List<Diplome> diplomes;

}
