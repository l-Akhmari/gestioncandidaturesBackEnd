package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.ChefDepartement;
import com.example.candidaturebachend.entities.Filiere;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartementDto {
    private int idDepartement;
    private String intitule;
   // private ChefDepartementDto chefDepartementDto;
    private List<FiliereDto> filieresDto;
}
