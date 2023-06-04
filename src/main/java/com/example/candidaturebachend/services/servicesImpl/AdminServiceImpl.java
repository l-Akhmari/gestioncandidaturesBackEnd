package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.Admin;
import com.example.candidaturebachend.repositories.AdminRepository;
import com.example.candidaturebachend.repositories.AdminRepository;
import com.example.candidaturebachend.services.IAdmin;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class AdminServiceImpl implements IAdmin {
    AdminRepository adminRepository;

    @Override
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> findAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin findAdminById(String id) {
        return adminRepository.findAdminById(id).orElseThrow(() -> new UserNotFoundException("Admin by id " + id + " was not found"));
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(String id) {
        adminRepository.deleteById(id);
    }
}