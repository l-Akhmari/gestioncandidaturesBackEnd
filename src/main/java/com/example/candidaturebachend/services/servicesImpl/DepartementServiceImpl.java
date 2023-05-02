package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.Departement;
import com.example.candidaturebachend.repositories.DepartementRepository;
import com.example.candidaturebachend.services.IDepartement;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class DepartementServiceImpl implements IDepartement {
    DepartementRepository departementRepository;

    @Override
    public Departement addDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public List<Departement> findAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement findDepartementById(Integer id) {
        return departementRepository.findDepartementByIdDepartement(id).orElseThrow(() -> new UserNotFoundException("Departement by id " + id + " was not found"));
    }

    @Override
    public Departement updateDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @Override
    public void deleteDepartement(Integer id) {
        departementRepository.deleteById(id);
    }
}
