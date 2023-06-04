package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Candidat;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnneUniversitaireDto {
    private int idAnne;
    private String anneUniv;
    List<CandidatDto> candidatsDto;
}
