package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.Fichier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichierRepository extends JpaRepository<Fichier, String> {

}
