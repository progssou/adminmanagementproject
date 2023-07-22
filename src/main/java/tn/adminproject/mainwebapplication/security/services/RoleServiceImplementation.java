package tn.adminproject.mainwebapplication.security.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.adminproject.mainwebapplication.models.*;
import tn.adminproject.mainwebapplication.repository.*;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor

public class RoleServiceImplementation implements IRole {

    RoleRepository roleRepository;
    UserRepository userRepository;

    @Override
    public Roles addRole(Roles role) {
        return roleRepository.save(role);
    }

    @Override
    public Roles updateRole(Roles role) {
        return roleRepository.save(role);
    }

    @Override
    public Roles retrieveRoleById(Long id) {
        return roleRepository.findById(id).orElse(null);

    }

    @Override
    public List<Roles> retrieveAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }

    @Override
    public Roles assignRoleToUser(String username, String roleName) {
        User u = userRepository.findByUsername(username).orElse(null);
        Roles r = roleRepository.findByName(ERole.valueOf(roleName)).orElse(null);
        u.getRoles().add(r);
        return roleRepository.save(r);
    }

    /* @Override
    public Role assignRoleToUser(Long idUser, Long idRole) {
        Role role = roleRepository.findById(idRole).orElse(null);
        User user = userRepository.findById(idUser).orElse(null);
        role.getUsers().add(user);
        return roleRepository.save(role);
    } */
}
