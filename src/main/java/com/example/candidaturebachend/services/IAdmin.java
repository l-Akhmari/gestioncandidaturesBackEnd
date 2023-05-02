package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.Admin;

import java.util.List;

public interface IAdmin {
    Admin addAdmin(Admin admin);
    List<Admin> findAllAdmins();
    Admin findAdminById(String id);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(String id);
}
