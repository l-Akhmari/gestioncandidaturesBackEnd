package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.repositories.TypeDiplomeRepository;
import com.example.candidaturebachend.services.ITypeDiplome;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class TypeDiplomeServiceImpl implements ITypeDiplome {
    TypeDiplomeRepository typeDiplomeRepository;

    @Override
    public TypeDiplome addTypeDiplome(TypeDiplome typeDiplome) {
        return typeDiplomeRepository.save(typeDiplome);
    }

    @Override
    public List<TypeDiplome> findAllTypeDiplomes() {
        return typeDiplomeRepository.findAll();
    }

    @Override
    public TypeDiplome findTypeDiplomeById(Integer id) {
        return typeDiplomeRepository.findTypeDiplomeByIdType(id).orElseThrow(() -> new UserNotFoundException("TypeDiplome by id " + id + " was not found"));
    }

    @Override
    public TypeDiplome updateTypeDiplome(TypeDiplome typeDiplome) {
        return typeDiplomeRepository.save(typeDiplome);
    }

    @Override
    public void deleteTypeDiplome(Integer id) {
        typeDiplomeRepository.deleteById(id);
    }
}
