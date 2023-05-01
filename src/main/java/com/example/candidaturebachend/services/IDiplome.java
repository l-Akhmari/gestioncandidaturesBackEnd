package com.example.candidaturebachend.services;

import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.entities.Diplome;

import java.util.List;

public interface IDiplome {
    DiplomeDto addDiplome(DiplomeDto diplome);
    List<Diplome> findAllDiplomes();
    DiplomeDto findDiplomeById(Integer id);
    DiplomeDto updateDiplome(DiplomeDto diplome);
    void deleteDiplomeDto(Integer id);
}
