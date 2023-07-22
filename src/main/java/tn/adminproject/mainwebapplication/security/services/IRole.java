package tn.adminproject.mainwebapplication.security.services;

import tn.adminproject.mainwebapplication.models.Roles;

import java.util.List;

public interface IRole {

    Roles addRole(Roles role);
    Roles updateRole(Roles role);
    Roles retrieveRoleById(Long id);

    List<Roles> retrieveAllRoles();
    void deleteRole(Long id);
    Roles assignRoleToUser(String username, String roleName);
    /* Role assignRoleToUser(Long idUser, Long idRole); */

}
