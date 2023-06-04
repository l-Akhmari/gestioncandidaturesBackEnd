package com.example.candidaturebachend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class NotesSemester {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idNotes;
    Double note;
    @ManyToOne
    Diplome diplome;
}
