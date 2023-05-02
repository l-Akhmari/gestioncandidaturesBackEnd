package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.Filiere;
import com.example.candidaturebachend.repositories.FiliereRepository;
import com.example.candidaturebachend.services.IFiliere;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class FiliereServiceImpl implements IFiliere {
    FiliereRepository filiereRepository;

    @Override
    public Filiere addFiliere(Filiere filiere) {
        return filiereRepository.save(filiere);
    }

    @Override
    public List<Filiere> findAllFilieres() {
        return filiereRepository.findAll();
    }

    @Override
    public Filiere findFiliereById(Integer id) {
        return filiereRepository.findFiliereByIdFiliere(id).orElseThrow(() -> new UserNotFoundException("Filiere by id " + id + " was not found"));
    }

    @Override
    public Filiere updateFiliere(Filiere filiere) {
        return filiereRepository.save(filiere);
    }

    @Override
    public void deleteFiliere(Integer id) {
        filiereRepository.deleteById(id);
    }
}
