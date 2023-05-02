package com.example.candidaturebachend.services;

import com.example.candidaturebachend.entities.Role;

import java.util.List;

public interface IRole {
    Role addRole(Role role);
    List<Role> findAllRoles();
    Role findRoleById(Integer id);
    Role updateRole(Role role);
    void deleteRole(Integer id);
}
