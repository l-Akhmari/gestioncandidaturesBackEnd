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

<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> 3aaed8b82d6d3485b6e01bd236a45460bba03195
    //Dto to typediplome
    public TypeDiplome typeDiplomeDtoToTypeDiplome(TypeDiplomeDto typeDiplomeDto) {
        if (typeDiplomeDto == null) {
            return null;
        }
        TypeDiplome typeDiplome = mapper.map(typeDiplomeDto, TypeDiplome.class);

        return  typeDiplome;
    }


<<<<<<< HEAD
>>>>>>> 40af6503f3b0db1ab39ced5ad5d66bd3a5a6e5fd
=======
>>>>>>> 3aaed8b82d6d3485b6e01bd236a45460bba03195

}
