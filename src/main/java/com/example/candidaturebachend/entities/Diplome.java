package com.example.candidaturebachend.entities;

import com.example.candidaturebachend.enums.TypeDiplome;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diplome implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDiplome;
    private TypeDiplome typeDiplome;
    private String specialiteDiplome;
    private Date anneeObtention;
    private String etablissement;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Candidat candidat;

    @OneToMany(mappedBy = "diplome")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Filiere> filieres;

    @OneToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Fichier fichier;
    @OneToMany(mappedBy = "diplome")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<NotesSemester> notesSemester;
}
