package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.Diplome;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DiplomeRepository extends JpaRepository<Diplome, Integer> {
    public List<Diplome> findAll();
    Optional<Diplome> findDiplomeByIdDiplome(Integer id);
}
