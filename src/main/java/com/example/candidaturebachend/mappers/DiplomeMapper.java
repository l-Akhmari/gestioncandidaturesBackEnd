package com.example.candidaturebachend.mappers;

import com.example.candidaturebachend.dto.*;
import com.example.candidaturebachend.entities.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Data
@ToString
@AllArgsConstructor
public class DiplomeMapper {

    private DozerBeanMapper mapper;
    private TypeDiplomeMapper typeDiplomeMapper;
    private FichierMapper fichierMapper;
    private NotesSemesterMapper notesSemesterMapper;

    //Diplome entity to Dto
    public DiplomeDto DiplomeToDiplomeDto(Diplome diplome) {
        if (diplome == null) {
            return null;
        }

        DiplomeDto diplomeDto = mapper.map(diplome, DiplomeDto.class);

        //Filieres mapping, entity to dto

        if(diplome.getFichier()!=null){
            FichierDto fichierDto = fichierMapper.fichierToFichierDto(diplome.getFichier());
            diplomeDto.setFichierDto(fichierDto);
        }


        /*if(diplome.getNotesSemester()!=null){
            List<NotesSemesterDto> notesSemesterDtos = notesSemesterMapper.AllNoteSemestersToDto(diplome.getNotesSemester());
            diplomeDto.setNotesSemesterDtos(notesSemesterDtos);
        }*/

        return  diplomeDto;
    }
    //Lists
    public List<DiplomeDto> AllDiplomesToDto(List<Diplome> diplomes) {

        if (CollectionUtils.isEmpty(diplomes)) {
            return Collections.emptyList();
        }

        List<DiplomeDto> diplomeDtos = new ArrayList<>();

        for (Diplome diplome : diplomes) {
            diplomeDtos.add(DiplomeToDiplomeDto(diplome));
        }
        return diplomeDtos;


  //return diplomes.stream().map(x ->DiplomeToDiplomeDto(x)).collect(Collectors.toList());



    }
    //DTO to diplome
    public Diplome DiplomeDtoToDiplome(DiplomeDto diplomeDto) {
        if (diplomeDto == null) {
            return null;
        }

        Diplome diplome = mapper.map(diplomeDto, Diplome.class);


        if(diplomeDto.getFichierDto()!=null){
            Fichier fichier = fichierMapper.fichierDtoTofichier(diplomeDto.getFichierDto());
            diplome.setFichier(fichier);
        }
        

        /*if(diplomeDto.getNotesSemesterDtos()!=null){
            List<NotesSemester> notesSemesters = notesSemesterMapper.AllNoteSemestersDtoToAllNoteSemesters(diplomeDto.getNotesSemesterDtos());
            diplome.setNotesSemester(notesSemesters);
        }*/

        return diplome;
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


 //return diplomesDto.stream().map(x ->DiplomeDtoToDiplome(x)).collect(Collectors.toList());



    }
}

