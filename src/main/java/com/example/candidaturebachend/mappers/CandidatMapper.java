/*
package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.AnneUniversitaireDto;
import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FiliereDto;
import com.example.candidaturebachend.entities.AnneUniversitaire;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.entities.Filiere;
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

    //Candidat to Dto
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

    //List CandidatsDto
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

    //Dto to candidat
    public Candidat CandidatDtoToCandidat(CandidatDto candidatDto){
        if(candidatDto==null)
            return null;
        Candidat candidat=mapper.map(candidatDto,Candidat.class);

        if(candidatDto.getFilieresDto()!=null){
            List<Filiere> filieres = filiereMapper.DtoToAllFilieres(candidatDto.getFilieresDto());
            candidat.setFilieres(filieres);
        }
        if(candidatDto.getAnneUniversitairesDto()!=null){
            List<AnneUniversitaire> anneUniversitaires = anneUniversitaireMapper.DtosToAnneUniversitaire(candidatDto.getAnneUniversitairesDto());
            candidat.setAnneUniversitaires(anneUniversitaires);
        }
        if(candidatDto.getDiplomesDto()!=null){
            List<Diplome> diplomes = diplomeMapper.AllDtoToDiplomes(candidatDto.getDiplomesDto());
            candidat.setDiplomes(diplomes);
        }


        return candidat;
    }

    //List Candidats
    public List<Candidat> AllDtoToCandidats(List<CandidatDto> candidatDtos) {

        if (CollectionUtils.isEmpty(candidatDtos)) {
            return Collections.emptyList();
        }
        List<Candidat> candidats = new ArrayList<>();

        for (CandidatDto candidatdto : candidatDtos) {
            candidats.add(CandidatDtoToCandidat(candidatdto));
        }
        return candidats;

    }

}
*/
