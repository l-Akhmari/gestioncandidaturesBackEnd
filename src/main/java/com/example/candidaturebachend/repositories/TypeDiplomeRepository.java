package com.example.candidaturebachend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TypeDiplomeRepository extends JpaRepository<TypeDiplome, Integer> {

    Optional<TypeDiplome> findTypeDiplomeByIdType(Integer id);
}
