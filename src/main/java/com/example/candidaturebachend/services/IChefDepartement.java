package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.ChefDepartement;

import java.util.List;

public interface IChefDepartement {
    ChefDepartement addChefDepartement(ChefDepartement chefDepartement);
    List<ChefDepartement> findAllChefDepartements();
    ChefDepartement findChefDepartementById(String id);
    ChefDepartement updateChefDepartement(ChefDepartement chefDepartement);
    void deleteChefDepartement(String id);
}
