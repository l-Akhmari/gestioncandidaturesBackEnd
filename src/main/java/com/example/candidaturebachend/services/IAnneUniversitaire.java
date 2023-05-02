package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.AnneUniversitaire;

import java.util.List;

public interface IAnneUniversitaire {
    AnneUniversitaire addAnneUniversitaire(AnneUniversitaire anneUniversitaire);
    List<AnneUniversitaire> findAllAnneUniversitaires();
    AnneUniversitaire findAnneUniversitaireById(Integer id);
    AnneUniversitaire updateAnneUniversitaire(AnneUniversitaire anneUniversitaire);
    void deleteAnneUniversitaire(Integer id);
}
