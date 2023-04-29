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
    private String notesSemester;

    @ManyToOne
    private Candidat candidat;

    @OneToMany(mappedBy = "diplome")
    private List<Filiere> filieres;

    @OneToOne(mappedBy = "diplome")
    private Fichier fichier;

    public void setNotesSemester(List<Double> notes) {
        this.notesSemester = notes.stream().map(Object::toString)
                .collect(Collectors.joining(","));
    }

    public List<Double> getNotesSemester() {
        return Arrays.stream(notesSemester.split(","))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }
}
