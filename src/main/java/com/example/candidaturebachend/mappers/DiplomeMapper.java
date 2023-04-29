package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.dto.FiliereDto;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.entities.Filiere;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Data
@ToString
public class DiplomeMapper {
    @Autowired
    private DozerBeanMapper mapper;

    @Autowired
    private FiliereMapper filiereMapper;

    //Diplome entity to Dto
    public DiplomeDto DiplomeToDiplomeDto(Diplome diplome) {
        if (diplome == null) {
            return null;
        }

        DiplomeDto diplomeDto = mapper.map(diplome, DiplomeDto.class);

        //Filieres mapping, entity to dto
        if (diplome.getFilieres() != null) {
            List<FiliereDto> filieresDto = filiereMapper.AllFilieresToDto(diplome.getFilieres());
            diplomeDto.setFilieresDto(filieresDto);
            // diplomeDto.setFilieresDto(mapper.map(diplomeDto.g(), ZoneDto.class));
        }


        return  diplomeDto;
    }
    //Lists
    public List<DiplomeDto> AllDiplomesToDto(List<Diplome> diplomes) {

        if (CollectionUtils.isEmpty(diplomes)) {
            return Collections.emptyList();
        }

        List<DiplomeDto> diplomeDtos = new ArrayList<DiplomeDto>();

        for (Diplome diplome : diplomes) {
            diplomeDtos.add(DiplomeToDiplomeDto(diplome));
        }
        return diplomeDtos;


        /*  return diplomes.stream().map(x ->DiplomeToDiplomeDto(x)).collect(Collectors.toList());

         */
    }
    //DTO to diplome
    public Diplome DiplomeDtoToDiplome(DiplomeDto diplomeDto) {
        if (diplomeDto == null) {
            return null;
        }

        Diplome diplome = mapper.map(diplomeDto, Diplome.class);

        //Filieres mapping dto to entity
        if (diplomeDto.getFilieresDto() != null) {

            List<Filiere> filieres = filiereMapper.DtoToAllFilieres(diplomeDto.getFilieresDto());
            diplome.setFilieres(filieres);
        }

    //Lists
    public List<Diplome> AllDtoToDiplomes(List<DiplomeDto> diplomesDto) {

        if (CollectionUtils.isEmpty(diplomesDto)) {
            return Collections.emptyList();
        }
        List<Diplome> diplomes = new ArrayList<>();

        for (DiplomeDto diplomedto : diplomesDto) {
            diplomes.add(DiplomeDtoToDiplome(diplomedto));
        }
        return diplomes;


        /* return diplomesDto.stream().map(x ->DiplomeDtoToDiplome(x)).collect(Collectors.toList());

         */
    }
}

