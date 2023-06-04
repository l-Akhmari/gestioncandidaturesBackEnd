package com.example.candidaturebachend.servicesDto.serviceinterDto;

import com.example.candidaturebachend.dto.DiplomeDto;

import java.util.List;

public interface IDiplomeDto {
    DiplomeDto saveDiplome(DiplomeDto diplomeDto);
    List<DiplomeDto> listDiplomes();
    DiplomeDto getDiplome(int id);
    DiplomeDto updateDiplome(DiplomeDto diplomeDto);
    void deleteDiplome(int id);
}
