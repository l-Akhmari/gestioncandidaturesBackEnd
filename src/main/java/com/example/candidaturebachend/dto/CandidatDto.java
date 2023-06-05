package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.AnneUniversitaire;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.entities.Filiere;
import com.example.candidaturebachend.entities.Utilisateur;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidatDto{
    private String idCandidat;
    protected String cin;
    protected String nom;
    protected String prenom;
    protected String addresse;
    protected String email;
    protected Date dateNaissance;
    protected String telephone;
    protected String mdp;
    private String cne;
    private String ville;
    private boolean admis;
    private List<FiliereDto> filieresDto;
    //private List<DiplomeDto> diplomesDto;

}
