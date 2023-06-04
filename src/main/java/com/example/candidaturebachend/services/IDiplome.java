package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.Diplome;

import java.util.List;
import java.util.Optional;

public interface IDiplome {
    Diplome addDiplome(Diplome diplome);
    List<Diplome> findAllDiplomes();
    Diplome findDiplomeById(Integer id);
    Diplome updateDiplome(Diplome diplome);
    void deleteDiplome(Integer id);
}
