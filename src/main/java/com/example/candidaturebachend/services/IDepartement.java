package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.Departement;

import java.util.List;

public interface IDepartement {
    Departement addDepartement(Departement departement);
    List<Departement> findAllDepartements();
    Departement findDepartementById(Integer id);
    Departement updateDepartement(Departement departement);
    void deleteDepartement(Integer id);
}
