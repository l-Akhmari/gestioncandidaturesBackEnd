package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.*;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.ChefDepartement;
import com.example.candidaturebachend.entities.Departement;
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
@Data
@AllArgsConstructor
@ToString
@Component


public class DepartementMapper {
    private DozerBeanMapper mapper;
    private FiliereMapper filiereMapper;

    //departement to dto
    public DepartementDto DepartementToDepartementDto(Departement departement){
        if(departement==null)
            return null;

        DepartementDto departementDto = mapper.map(departement,DepartementDto.class);
        //list filiers
        if(departement.getFilieres()!=null){
            List<FiliereDto> filieresDto = filiereMapper.AllFilieresToDto(departement.getFilieres());
            departementDto.setFilieresDto(filieresDto);
        }
        return departementDto;
    }

    public List<DepartementDto> departementToDtos(List<Departement> departements){
        if (CollectionUtils.isEmpty(departements)) {
            return Collections.emptyList();
        }

        List<DepartementDto> departementDtos = new ArrayList<>();

        for (Departement departement : departements) {
            departementDtos.add(DepartementToDepartementDto(departement));
        }
        return departementDtos;
    }

    //departementDto to departement
    public Departement DepartementDtoToDepartement(DepartementDto departementDto){
        if(departementDto==null){
            return null;
        }
        Departement departement=mapper.map(departementDto, Departement.class);
        //chefdepartement object


        //list filiers
        if(departementDto.getFilieresDto()!=null){
            List<Filiere> filieres = filiereMapper.DtoToAllFilieres(departementDto.getFilieresDto());
            departement.setFilieres(filieres);
        }
        return departement;
    }

    public List<Departement> DtosTodepartement(List<DepartementDto> departementDtos){

        if (CollectionUtils.isEmpty(departementDtos)) {
            return Collections.emptyList();
        }

        List<Departement> departements = new ArrayList<>();

        for (DepartementDto departementDto : departementDtos) {
            departements.add(DepartementDtoToDepartement(departementDto));
        }
        return departements;
    }


}
