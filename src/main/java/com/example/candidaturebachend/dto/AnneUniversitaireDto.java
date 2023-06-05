package com.example.candidaturebachend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnneUniversitaireDto {
    private int id;
    private String anneUniv;
    List<CandidatDto> candidatsDto;
}
