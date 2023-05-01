package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.mappers.DiplomeMapper;
import com.example.candidaturebachend.repositories.DiplomeRepository;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.services.IDiplome;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiplomeServiceImpl implements IDiplome {
    @Autowired
    DiplomeRepository diplomeRepository;
    @Autowired
    DiplomeMapper diplomeMapper;


    @Override
    public DiplomeDto addDiplome(DiplomeDto diplome) {
        return null;
    }

    @Override
    public List<DiplomeDto> findAllDiplomes() {
        return null;
    }

    @Override
    public DiplomeDto findDiplomeById(Integer id) {
        return null;
    }

    @Override
    public DiplomeDto updateDiplome(DiplomeDto diplome) {
        return null;
    }

    @Override
    public void deleteDiplomeDto(Integer id) {

    }
}
