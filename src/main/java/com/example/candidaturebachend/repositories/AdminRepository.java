package com.example.candidaturebachend.repositories;

import com.example.candidaturebachend.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
//    Optional<Admin> findAdminById(int id);
}
