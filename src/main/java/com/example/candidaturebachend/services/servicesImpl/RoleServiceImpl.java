package com.example.candidaturebachend.services.servicesImpl;

import com.example.candidaturebachend.Exceptions.UserNotFoundException;
import com.example.candidaturebachend.entities.Role;
import com.example.candidaturebachend.repositories.RoleRepository;
import com.example.candidaturebachend.services.IRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@AllArgsConstructor
public class RoleServiceImpl implements IRole {
    RoleRepository roleRepository;

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role findRoleById(Integer id) {
        return roleRepository.findRoleByIdRole(id).orElseThrow(() -> new UserNotFoundException("Role by id " + id + " was not found"));
    }

    @Override
    public Role updateRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Integer id) {
        roleRepository.deleteById(id);
    }
}
