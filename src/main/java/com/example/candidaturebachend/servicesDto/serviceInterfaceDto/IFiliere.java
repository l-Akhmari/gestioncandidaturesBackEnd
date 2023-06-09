package com.example.candidaturebachend.servicesDto.serviceInterfaceDto;





import com.example.candidaturebachend.Exceptions.DepartementNotFoundException;
import com.example.candidaturebachend.Exceptions.FiliereNotFoundException;
import com.example.candidaturebachend.dto.DepartementDto;
import com.example.candidaturebachend.dto.FiliereDto;

import java.util.List;

public interface IFiliere {

    FiliereDto savefiliere(FiliereDto filiereDto, DepartementDto departementId);

    List<FiliereDto> listFilieres();

    FiliereDto getFiliereById(int filiereId) throws FiliereNotFoundException;

    List<FiliereDto> getFilieresForCandidat(int candidatId);


    void deletFiliere(int filiereId);





}
