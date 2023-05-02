package com.example.candidaturebachend.services;

import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.entities.Candidat;

import java.util.List;

public interface ICandidat {
    Candidat addCandidat(Candidat candidat);
    List<Candidat> findAllCandidats();
    Candidat findCandidatById(String id);
    Candidat updateCandidat(Candidat candidat);
    void deleteCandidat(String id);
}
