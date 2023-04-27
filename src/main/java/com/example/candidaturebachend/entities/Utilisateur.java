package com.example.candidaturebachend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
    protected String cin;
    protected String nom;
    protected String prenom;
    protected String addresse;
    protected String email;
    protected String dateNaissance;
    protected String telephone;
    protected String mdp;
    protected Role role;


}
