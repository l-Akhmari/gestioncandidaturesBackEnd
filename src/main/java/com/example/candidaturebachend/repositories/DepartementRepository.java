package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.ChefDepartement;
import com.example.candidaturebachend.entities.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {

}
