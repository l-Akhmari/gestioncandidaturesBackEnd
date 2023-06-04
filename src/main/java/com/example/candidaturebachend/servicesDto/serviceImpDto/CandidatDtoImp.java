package com.example.candidaturebachend.servicesDto.serviceImpDto;

import com.example.candidaturebachend.Exceptions.CandidateNotFoundException;
import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FichierDto;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.servicesDto.serviceInterfaceDto.ICandidat;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class CandidatDtoImp implements ICandidat {


    @Override
    public CandidatDto saveCandidat(CandidatDto candidatDto, DiplomeDto diplomeDto, FichierDto fichierDto) {
        return null;
    }

    @Override
    public List<Candidat> listCandidats() {
        return null;
    }

    @Override
    public CandidatDto getCandidat(String id) throws CandidateNotFoundException {
        return null;
    }

    @Override
    public CandidatDto updateCandidat(CandidatDto candidatDto, DiplomeDto diplomeDto, FichierDto fichierDto) {
        return null;
    }

    @Override
    public void deleteCandidat(String id) {

    }
}
