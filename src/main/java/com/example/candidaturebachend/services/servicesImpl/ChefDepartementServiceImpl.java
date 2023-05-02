package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.ChefDepartement;
import com.example.candidaturebachend.repositories.ChefDepartementRepository;
import com.example.candidaturebachend.services.IChefDepartement;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class ChefDepartementServiceImpl implements IChefDepartement {
    ChefDepartementRepository chefDepartementRepository;

    @Override
    public ChefDepartement addChefDepartement(ChefDepartement chefDepartement) {
        return chefDepartementRepository.save(chefDepartement);
    }

    @Override
    public List<ChefDepartement> findAllChefDepartements() {
        return chefDepartementRepository.findAll();
    }

    @Override
    public ChefDepartement findChefDepartementById(String id) {
        return chefDepartementRepository.findChefDepartementById(id).orElseThrow(() -> new UserNotFoundException("ChefDepartement by id " + id + " was not found"));
    }

    @Override
    public ChefDepartement updateChefDepartement(ChefDepartement chefDepartement) {
        return chefDepartementRepository.save(chefDepartement);
    }

    @Override
    public void deleteChefDepartement(String id) {
        chefDepartementRepository.deleteById(id);
    }
}
