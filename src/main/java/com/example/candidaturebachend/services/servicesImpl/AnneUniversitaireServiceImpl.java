package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.AnneUniversitaire;
import com.example.candidaturebachend.repositories.AnneUniversitaireRepository;
import com.example.candidaturebachend.services.IAnneUniversitaire;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class AnneUniversitaireServiceImpl implements IAnneUniversitaire {
    AnneUniversitaireRepository anneUniversitaireRepository;

    @Override
    public AnneUniversitaire addAnneUniversitaire(AnneUniversitaire anneUniversitaire) {
        return anneUniversitaireRepository.save(anneUniversitaire);
    }

    @Override
    public List<AnneUniversitaire> findAllAnneUniversitaires() {
        return anneUniversitaireRepository.findAll();
    }

    @Override
    public AnneUniversitaire findAnneUniversitaireById(Integer id) {
        return anneUniversitaireRepository.findAnneUniversitaireByIdAnne(id).orElseThrow(() -> new UserNotFoundException("AnneUniversitaire by id " + id + " was not found"));
    }

    @Override
    public AnneUniversitaire updateAnneUniversitaire(AnneUniversitaire anneUniversitaire) {
        return anneUniversitaireRepository.save(anneUniversitaire);
    }

    @Override
    public void deleteAnneUniversitaire(Integer id) {
        anneUniversitaireRepository.deleteById(id);
    }
}
