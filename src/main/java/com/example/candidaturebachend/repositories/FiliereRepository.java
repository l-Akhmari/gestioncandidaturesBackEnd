package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FiliereRepository extends JpaRepository<Filiere, Integer> {

  //  Optional<Filiere> findFiliereById(Integer id);
}
