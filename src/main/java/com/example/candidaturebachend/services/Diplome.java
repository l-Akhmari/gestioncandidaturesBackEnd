package com.example.candidaturebachend.services;

import java.util.List;

public interface Diplome {
    Diplome addDiplome(Diplome diplome);
    List<Diplome> findAllDiplomes();
    Diplome findDiplomeById(Integer id);
    Diplome updateDiplome(Diplome diplome);
    void deleteDiplome(Integer id);
    }
