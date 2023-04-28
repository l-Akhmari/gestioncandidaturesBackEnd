package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepository extends JpaRepository<Candidat,String> {

}
