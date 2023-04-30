package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.ChefDepartementDto;
import com.example.candidaturebachend.entities.ChefDepartement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ToString
@AllArgsConstructor
public class ChefDepartementMapper {
    private DozerBeanMapper mapper;


    //chefdepartement to dto
    public ChefDepartementDto chefDepartemenToChefDepartementDto(ChefDepartement chefDepartement){
        //TODO:todo

        return null;
    }
    public List<ChefDepartementDto> ChefDepartementToDtos(List<ChefDepartement> chefDepartement){
        //TODO:todo

        return null;
    }


    //dto to chefDepartement
    public ChefDepartement chefDepartemenDtoToChefDepartement(ChefDepartementDto chefDepartementDto){
        //TODO:todo

        return null;
    }
    public List<ChefDepartement> DtosToChefDepartement(List<ChefDepartementDto> chefDepartementDto){
        //TODO:todo

        return null;
    }

}
