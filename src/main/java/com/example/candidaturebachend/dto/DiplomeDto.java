package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.*;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

    private TypeDiplomeDto typeDiplomeDto;
    private String specialiteDiplome;
    private Date anneeObtention;
    private String etablissement;

    private CandidatDto candidatDto;
    private List<FiliereDto> filieresDto;

    private FichierDto fichierDto;
    private List<NotesSemesterDto> notesSemesterDto;

}
