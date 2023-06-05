package com.example.candidaturebachend.dto;

import com.example.candidaturebachend.entities.Admin;
import com.example.candidaturebachend.entities.Departement;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChefDepartementDto {
    private String idChefDep;
    protected String cin;
    protected String nom;
    protected String prenom;
    protected String addresse;
    protected String email;
    protected Date dateNaissance;
    protected String telephone;
    protected String mdp;
    private String matricule;
    private DepartementDto departementDto;

}
