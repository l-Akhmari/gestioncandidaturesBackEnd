package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FiliereDto;
import com.example.candidaturebachend.dto.TypeDiplomeDto;
import com.example.candidaturebachend.entities.Filiere;
import com.example.candidaturebachend.entities.TypeDiplome;
import org.dozer.DozerBeanMapper;

public class TypeDiplomeMapper {

    private DozerBeanMapper mapper;

    //typeDiplome to Dto
    public TypeDiplomeDto typeDiplomeToTypeDiplomeDto(TypeDiplome typeDiplome) {
        if (typeDiplome == null) {
            return null;
        }
        TypeDiplomeDto typeDiplomeDto = mapper.map(typeDiplome, TypeDiplomeDto.class);

        return  typeDiplomeDto;
    }

}
