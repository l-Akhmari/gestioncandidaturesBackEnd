package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Diplome;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FichierDto {
    private String idFichier;
    private String chemin;
    private DiplomeDto diplomeDto;

}
