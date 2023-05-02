package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.repositories.CandidatRepository;
import com.example.candidaturebachend.services.ICandidat;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class CandidatServiceImpl implements ICandidat {
    CandidatRepository candidatRepository;

    @Override
    public Candidat addCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public List<Candidat> findAllCandidats() {
        return candidatRepository.findAll();
    }

    @Override
    public Candidat findCandidatById(String id) {
        return candidatRepository.findCandidatById(id).orElseThrow(() -> new UserNotFoundException("Candidat by id " + id + " was not found"));
    }

    @Override
    public Candidat updateCandidat(Candidat candidat) {
        return candidatRepository.save(candidat);
    }

    @Override
    public void deleteCandidat(String id) {
        candidatRepository.deleteById(id);
    }
}
