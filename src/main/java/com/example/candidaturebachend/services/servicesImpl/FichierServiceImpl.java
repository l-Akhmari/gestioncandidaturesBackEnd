package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.Fichier;
import com.example.candidaturebachend.repositories.FichierRepository;
import com.example.candidaturebachend.services.IFichier;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class FichierServiceImpl implements IFichier {
    FichierRepository fichierRepository;

    @Override
    public Fichier addFichier(Fichier fichier) {
        return fichierRepository.save(fichier);
    }

    @Override
    public List<Fichier> findAllFichiers() {
        return fichierRepository.findAll();
    }

    @Override
    public Fichier findFichierById(String id) {
        return fichierRepository.findFichierByIdFichier(id).orElseThrow(() -> new UserNotFoundException("Fichier by id " + id + " was not found"));
    }

    @Override
    public Fichier updateFichier(Fichier fichier) {
        return fichierRepository.save(fichier);
    }

    @Override
    public void deleteFichier(String id) {
        fichierRepository.deleteById(id);
    }
}
