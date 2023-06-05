package com.example.candidaturebachend.servicesDto.serviceImpDto;

import com.example.candidaturebachend.Exceptions.CandidateNotFoundException;
import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.mappers.CandidatMapper;
import com.example.candidaturebachend.repositories.CandidatRepository;
import com.example.candidaturebachend.repositories.FichierRepository;
import com.example.candidaturebachend.servicesDto.serviceInterfaceDto.ICandidat;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class CandidatDtoServiceImp implements ICandidat {
        private CandidatRepository candidatRepository;
        private CandidatMapper candidatMapper;

    @Override
    public CandidatDto saveCandidat(CandidatDto candidatDto) {
        Candidat candidat=candidatMapper.CandidatDtoToCandidat(candidatDto);
        candidat.setId(UUID.randomUUID().toString());
        Candidat savedCandidat=candidatRepository.save(candidat);

        return candidatMapper.candidatToDto(savedCandidat);
    }

    @Override
    public List<CandidatDto> listCandidats() {

        List<Candidat> candidats=candidatRepository.findAll();
        List<CandidatDto> candidatDtos=candidats.stream()
                .map(candidat -> candidatMapper.candidatToDto(candidat))
                .collect(Collectors.toList());
        return candidatDtos;   
    }

    @Override
    public CandidatDto getCandidat(String id) throws CandidateNotFoundException {
        Candidat candidat=candidatRepository.findById(id).orElse(null);
        if (candidat==null)throw new CandidateNotFoundException("candidat not found");

        return candidatMapper.candidatToDto(candidat);
    }

    @Override
    public CandidatDto updateCandidat(CandidatDto candidatDto) {
        Candidat candidat=candidatMapper.CandidatDtoToCandidat(candidatDto);
        Candidat savedCandidat=candidatRepository.save(candidat);

        return candidatMapper.candidatToDto(savedCandidat);    }

    @Override
    public void deleteCandidat(String id) {
        candidatRepository.deleteById(id);
    }
}
