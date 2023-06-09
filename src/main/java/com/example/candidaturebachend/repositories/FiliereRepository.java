package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FiliereRepository extends JpaRepository<Filiere, Integer> {
    List<Filiere> findByCandidatsId(int candidatId);

    //  Optional<Filiere> findFiliereById(Integer id);
}
