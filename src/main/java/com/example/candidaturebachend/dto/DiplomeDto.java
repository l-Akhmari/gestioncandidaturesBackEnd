package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Fichier;
import com.example.candidaturebachend.entities.Filiere;
import com.example.candidaturebachend.entities.TypeDiplome;

import java.util.Date;
import java.util.List;

public class DiplomeDto {

    private int idDiplome;
    private String specialiteDiplome;
    private Date anneeObtention;
    private String etablissement;
    private String notesSemester;

    private TypeDiplome typeDiplome;
    private Candidat candidat;
    private List<Filiere> filieres;
    private Fichier fichier;

}
