package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.DirectionPedagogique;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DirectionPedagogiqueRepository extends JpaRepository<DirectionPedagogique, String> {

    Optional<DirectionPedagogique> findDirectionPedagogiqueById(String id);
}
