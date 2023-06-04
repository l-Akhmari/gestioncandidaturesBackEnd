package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Admin;
import com.example.candidaturebachend.entities.Departement;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChefDepartementDto {
    private long idChefDep;
    private String matricule;

    private DepartementDto departementDto;

    private AdminDto adminDto;
}
