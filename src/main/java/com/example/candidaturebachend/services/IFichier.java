package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.Fichier;

import java.util.List;

public interface IFichier {
    Fichier addFichier(Fichier fichier);
    List<Fichier> findAllFichiers();
    Fichier findFichierById(String id);
    Fichier updateFichier(Fichier fichier);
    void deleteFichier(String id);
}
