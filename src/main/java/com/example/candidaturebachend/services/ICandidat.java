package com.example.candidaturebachend.services;

import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.entities.Candidat;

import java.util.List;

public interface ICandidat {
    CandidatDto addCandidat(CandidatDto candidat);
    List<CandidatDto> findAllCandidats();
    CandidatDto findCandidatById(String id);
    CandidatDto updateCandidat(CandidatDto candidat);
    void deleteCandidat(String id);
}
