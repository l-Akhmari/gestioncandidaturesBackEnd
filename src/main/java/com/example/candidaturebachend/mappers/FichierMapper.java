package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FichierDto;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.entities.Fichier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@ToString
@Component
public class FichierMapper {
    private DozerBeanMapper mapper;

    //fichier to Dto
    public FichierDto fichierToFichierDto(Fichier fichier) {
        if (fichier == null) {
            return null;
        }
        FichierDto fichierDto = mapper.map(fichier, FichierDto.class);

        return  fichierDto;
    }

    public Fichier fichierDtoTofichier(FichierDto fichierDto){
        if (fichierDto == null) {
            return null;
        }
        Fichier fichier = mapper.map(fichierDto, Fichier.class);
        return  fichier;
    }
}
