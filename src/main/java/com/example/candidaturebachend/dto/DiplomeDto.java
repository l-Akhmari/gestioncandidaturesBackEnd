package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Fichier;
import com.example.candidaturebachend.entities.Filiere;
import com.example.candidaturebachend.entities.TypeDiplome;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiplomeDto {

    private int idDiplome;
    private String specialiteDiplome;
    private Date anneeObtention;
    private String etablissement;
    private String notesSemester;

    private TypeDiplomeDto typeDiplomeDto;
    private CandidatDto candidatDto;
    private List<FiliereDto> filieresDto;
    private FichierDto fichierDto;

}
