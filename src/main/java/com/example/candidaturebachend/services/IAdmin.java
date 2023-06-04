package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.Admin;

import java.util.List;

public interface IAdmin {
    Admin addAdmin(Admin admin);
    List<Admin> findAllAdmins();
    Admin findAdminById(Integer id);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(Integer id);
}
