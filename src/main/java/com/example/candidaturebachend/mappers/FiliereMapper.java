package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.CandidatDto;
import com.example.candidaturebachend.dto.DepartementDto;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FiliereDto;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Departement;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.entities.Filiere;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Filer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Data
@ToString
@AllArgsConstructor
public class FiliereMapper {
    private DozerBeanMapper mapper;

    //Filiere to Dto
    public FiliereDto FiliereToFiliereDto(Filiere filiere) {
        if (filiere == null) {
            return null;
        }

        FiliereDto filiereDto = mapper.map(filiere, FiliereDto.class);

        return  filiereDto;
    }
    //Lists
    public List<FiliereDto> AllFilieresToDto(List<Filiere> filieres) {

        if (CollectionUtils.isEmpty(filieres)) {
            return Collections.emptyList();
        }

        List<FiliereDto> filiereDtos = new ArrayList<FiliereDto>();

        for (Filiere filiere : filieres) {
            filiereDtos.add(FiliereToFiliereDto(filiere));
        }
        return filiereDtos;


    //return contacts.stream().map(x ->ContactToContactDto(x)).collect(Collectors.toList());


    }
    //Dto to Filiere
    public Filiere FiliereDtoToFiliere(FiliereDto filiereDto) {
        if (filiereDto == null) {
            return null;
        }

        Filiere filiere = mapper.map(filiereDto, Filiere.class);

        return filiere;
    }

    public List<Filiere> DtoToAllFilieres(List<FiliereDto> filiereDtos){
        if (CollectionUtils.isEmpty(filiereDtos)) {
            return Collections.emptyList();
        }

        List<Filiere> filieres = new ArrayList<>();

        for (FiliereDto filiereDto : filiereDtos) {
            filieres.add(FiliereDtoToFiliere(filiereDto));
        }
        return filieres;
    }

}

