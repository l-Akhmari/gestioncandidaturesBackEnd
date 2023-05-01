package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FiliereDto;
import com.example.candidaturebachend.dto.TypeDiplomeDto;
import com.example.candidaturebachend.entities.Filiere;
import com.example.candidaturebachend.entities.TypeDiplome;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
@Data
@ToString
@AllArgsConstructor
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

    //Dto to typediplome
    public TypeDiplome typeDiplomeDtoToTypeDiplome(TypeDiplomeDto typeDiplomeDto) {
        if (typeDiplomeDto == null) {
            return null;
        }
        TypeDiplome typeDiplome = mapper.map(typeDiplomeDto, TypeDiplome.class);

        return  typeDiplome;
    }


}
