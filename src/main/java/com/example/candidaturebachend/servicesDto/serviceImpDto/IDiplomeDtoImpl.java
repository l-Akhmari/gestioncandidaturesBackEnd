package com.example.candidaturebachend.servicesDto.serviceImpDto;

import com.example.candidaturebachend.Exceptions.DiplomeNotFoundException;
import com.example.candidaturebachend.dto.DiplomeDto;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.mappers.DiplomeMapper;
import com.example.candidaturebachend.repositories.DiplomeRepository;
import com.example.candidaturebachend.servicesDto.serviceinterDto.IDiplomeDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class IDiplomeDtoImpl implements IDiplomeDto {
    private DiplomeRepository diplomeRepository;
    private DiplomeMapper diplomeMapper;
    @Override
    public DiplomeDto saveDiplome(DiplomeDto diplomeDto) {
        Diplome diplome=diplomeMapper.DiplomeDtoToDiplome(diplomeDto);
        Diplome savedDiplome=diplomeRepository.save(diplome);

        return diplomeMapper.DiplomeToDiplomeDto(savedDiplome);
    }

    @Override
    public List<DiplomeDto> listDiplomes() {
        List<Diplome> diplomes=diplomeRepository.findAll();
        List<DiplomeDto> diplomeDtos=diplomes.stream()
                .map(diplome -> diplomeMapper.DiplomeToDiplomeDto(diplome))
                .collect(Collectors.toList());
        return diplomeDtos;
    }

    @Override
    public DiplomeDto getDiplome(int id) {
        Diplome diplome=diplomeRepository.findById(id).orElse(null);
        if (diplome==null)throw new DiplomeNotFoundException("diplome not found");

        return diplomeMapper.DiplomeToDiplomeDto(diplome);
    }

    @Override
    public DiplomeDto updateDiplome(DiplomeDto diplomeDto) {
        Diplome diplome=diplomeMapper.DiplomeDtoToDiplome(diplomeDto);
        Diplome savedDiplome=diplomeRepository.save(diplome);

        return diplomeMapper.DiplomeToDiplomeDto(savedDiplome);
    }

    @Override
    public void deleteDiplome(int id) {
        diplomeRepository.deleteById(id);
    }
}
