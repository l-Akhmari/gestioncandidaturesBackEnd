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

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidatDto extends Utilisateur {

    private String idCandidat;
    private String cne;
    private String ville;
    private boolean admis;


    private List<FiliereDto> filieresDto;

    private List<AnneUniversitaireDto> anneUniversitairesDto;

    private List<DiplomeDto> diplomesDto;

}
