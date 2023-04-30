package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.*;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.Departement;
import org.dozer.DozerBeanMapper;

import java.util.List;

public class DepartementMapper {
    private DozerBeanMapper mapper;
    private FiliereMapper filiereMapper;

    public DepartementDto DepartementToDepartementDto(Departement departement){
        if(departement==null)
            return null;

        DepartementDto departementDto = mapper.map(departement,DepartementDto.class);
        if(departement.getFilieres()!=null){
            List<FiliereDto> filieresDto = filiereMapper.AllFilieresToDto(departement.getFilieres());
            departementDto.setFilieresDto(filieresDto);
        }
        if(departement.getChefDepartement()!=null){
            //TODO:Mapping ChefDepartement
        }
        return departementDto;
    }
}
