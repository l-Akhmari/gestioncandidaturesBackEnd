package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.dto.DiplomeDto;
//import com.example.candidaturebachend.mappers.DiplomeMapper;
import com.example.candidaturebachend.entities.Diplome;
import com.example.candidaturebachend.repositories.DiplomeRepository;
import com.example.candidaturebachend.services.IDiplome;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class DiplomeServiceImpl implements IDiplome {
    DiplomeRepository diplomeRepository;
    //DiplomeMapper diplomeMapper;



    @Override
    public DiplomeDto addDiplome(DiplomeDto diplomeDto) {
     //   return diplomeMapper.DiplomeToDiplomeDto(diplomeRepository.save(diplomeMapper.DiplomeDtoToDiplome(diplomeDto)));
   return null;
    }

    @Override
    public List<Diplome> findAllDiplomes() {
       // return  diplomeMapper.AllDiplomesToDto(diplomeRepository.findAll());

        return diplomeRepository.findAll();
    }

    @Override
    public DiplomeDto findDiplomeById(Integer id) {
        return null;
    }

    @Override
    public DiplomeDto updateDiplome(DiplomeDto diplome) {
        return null;
    }

    @Override
    public void deleteDiplomeDto(Integer id) {

    }
}
