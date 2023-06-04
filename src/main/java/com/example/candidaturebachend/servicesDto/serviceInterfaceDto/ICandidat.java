package com.example.candidaturebachend.servicesDto.serviceInterfaceDto;

import com.example.candidaturebachend.Exceptions.CandidateNotFoundException;
import com.example.candidaturebachend.Exceptions.fileNotFoundException;
import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FichierDto;
import com.example.candidaturebachend.entities.Candidat;

import java.util.List;

public interface ICandidat {
    CandidatDto saveCandidat(CandidatDto candidatDto, DiplomeDto diplomeDto, FichierDto fichierDto);
    List<Candidat> listCandidats();
    CandidatDto getCandidat(String id) throws CandidateNotFoundException;
    CandidatDto updateCandidat(CandidatDto candidatDto, DiplomeDto diplomeDto, FichierDto fichierDto);
    void deleteCandidat(String id);
}
