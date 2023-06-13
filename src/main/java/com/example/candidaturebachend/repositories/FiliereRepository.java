package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.Departement;
import com.example.candidaturebachend.entities.Filiere;
import com.example.candidaturebachend.enums.TypeFormation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FiliereRepository extends JpaRepository<Filiere, Integer> {
    List<Filiere> findByCandidatsId(int candidatId);
    List<Filiere> findFiliereByTypeFormation(TypeFormation typeFormation);

    List<Filiere> findFiliereByDepartement(Departement departement);

    //  Optional<Filiere> findFiliereById(Integer id);
}
