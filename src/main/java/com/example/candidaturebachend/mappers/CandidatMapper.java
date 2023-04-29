package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.AnneUniversitaireDto;
import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FiliereDto;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Diplome;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Data
@ToString
@AllArgsConstructor
public class CandidatMapper {

    private DozerBeanMapper mapper;
    private FiliereMapper filiereMapper;
    private AnneUniversitaireMapper anneUniversitaireMapper;
    private DiplomeMapper diplomeMapper;

    public CandidatDto candidatToDto(Candidat candidat){
        if(candidat==null)
            return null;
        //we have to verify it with mustapha !!!!!!!!!!!!!!!!!!!!!!!!!!!"the line +2"
        CandidatDto candidatDto=mapper.map(candidat,CandidatDto.class);
        if(candidat.getFilieres()!=null){
            List<FiliereDto> filieresDto = filiereMapper.AllFilieresToDto(candidat.getFilieres());
            candidatDto.setFilieresDto(filieresDto);
        }
        if(candidat.getAnneUniversitaires()!=null){
            List<AnneUniversitaireDto> anneUniversitaireDtos = anneUniversitaireMapper.AllAnneUniversitaireToDto(candidat.getAnneUniversitaires());
            candidatDto.setAnneUniversitairesDto(anneUniversitaireDtos);
        }
        if(candidat.getDiplomes()!=null){
            List<DiplomeDto> diplomeDtos = diplomeMapper.AllDiplomesToDto(candidat.getDiplomes());
            candidatDto.setDiplomesDto(diplomeDtos);
        }
        return candidatDto;
    }

    public List<CandidatDto> AllCandidatsToDto(List<Candidat> candidats){
        if (CollectionUtils.isEmpty(candidats)) {
            return Collections.emptyList();
        }
        List<CandidatDto> candidatDtos = new ArrayList<>();

        for (Candidat candidat : candidats) {
            candidatDtos.add(candidatToDto(candidat));
        }
        return candidatDtos;

    }


}
