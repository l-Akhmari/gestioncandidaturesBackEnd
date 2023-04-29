package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.AnneUniversitaireDto;
import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.dto.FiliereDto;
import com.example.candidaturebachend.entities.AnneUniversitaire;
import com.example.candidaturebachend.entities.Filiere;
import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnneUniversitaireMapper {

    private DozerBeanMapper mapper;
    private CandidatMapper candidatMapper;

    public AnneUniversitaireDto anneUniversitaireToanneUniversitaireDto(AnneUniversitaire anneUniversitaire){
        if(anneUniversitaire==null)
            return null;
        AnneUniversitaireDto anneUniversitaireDto=mapper.map(anneUniversitaire, AnneUniversitaireDto.class);
        if (anneUniversitaire.getCandidats() != null) {
            List<CandidatDto> candidatDtos = candidatMapper.AllCandidatsToDto(anneUniversitaire.getCandidats());
            anneUniversitaireDto.setCandidatsDto(candidatDtos);
            // diplomeDto.setFilieresDto(mapper.map(diplomeDto.g(), ZoneDto.class));
        }
        return anneUniversitaireDto;


    }
    public List<AnneUniversitaireDto> AllAnneUniversitaireToDto(List<AnneUniversitaire> anneUniversitaires){

        if (CollectionUtils.isEmpty(anneUniversitaires)) {
            return Collections.emptyList();
        }
        List<AnneUniversitaireDto> anneUniversitaireDtos=new ArrayList<>();
        for (AnneUniversitaire anneUniversitaire : anneUniversitaires) {
            anneUniversitaireDtos.add(anneUniversitaireToanneUniversitaireDto(anneUniversitaire));
        }
        return anneUniversitaireDtos;

    }


}
