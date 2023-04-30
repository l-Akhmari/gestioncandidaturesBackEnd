package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.*;
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
    private List<NotesSemesterDto> notesSemesterDtos;

}
