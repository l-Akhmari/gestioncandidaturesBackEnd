package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiplome;
    @OneToOne
    private TypeDiplome typeDiplome;
    private String specialiteDiplome;
    private Date anneeObtention;
    private String etablissement;
    //private String notesSemester;
    @ManyToOne
    private Candidat candidat;
    @OneToMany(mappedBy = "diplome")
    private List<Filiere> filieres;
    @OneToOne(mappedBy = "diplome")
    private Fichier fichier;
    @OneToMany(mappedBy = "diplome")
    private List<NotesSemester> notesSemester;
}
