package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.Filiere;

import java.util.List;

public interface IFiliere {
    Filiere addFiliere(Filiere filiere);
    List<Filiere> findAllFilieres();
    Filiere findFiliereById(Integer id);
    Filiere updateFiliere(Filiere filiere);
    void deleteFiliere(Integer id);
}
