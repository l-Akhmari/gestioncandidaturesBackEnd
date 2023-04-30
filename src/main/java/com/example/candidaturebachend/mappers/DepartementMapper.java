package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.*;
import com.example.candidaturebachend.entities.Candidat;
import com.example.candidaturebachend.entities.ChefDepartement;
import com.example.candidaturebachend.entities.Departement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@AllArgsConstructor
@ToString
@Component

public class DepartementMapper {
    private DozerBeanMapper mapper;
    private FiliereMapper filiereMapper;
    private ChefDepartementMapper chefDepartementMapper;

    //departement to dto
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

    public List<DepartementDto> departementToDtos(List<Departement> departements){
        return null;
    }

    //departementDto to departement
    public Departement DepartementDtoToDepartement(DepartementDto departementDto){
        if(departementDto==null){
            return null;
        }
        Departement departement=mapper.map(departementDto, Departement.class);
        //chefdepartement object

        if(departementDto.getChefDepartementDto()!=null){
            ChefDepartement chefDepartement=chefDepartementMapper.chefDepartemenDtoToChefDepartement(departementDto.getChefDepartementDto());
            departement.setChefDepartement(chefDepartement);
        }

        //list filiers
        return null;
        //TODO:todo


    }

    public List<Departement> DtosTodepartement(List<DepartementDto> departementDtos){

        //TODO:todo
        return null;
    }


}
