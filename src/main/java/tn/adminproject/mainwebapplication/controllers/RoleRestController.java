package tn.adminproject.mainwebapplication.controllers;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.adminproject.mainwebapplication.security.services.IRole;
import tn.adminproject.mainwebapplication.models.Roles;

import java.util.List;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")

public class RoleRestController {

    @Autowired
    IRole iRole;

    // URL : http://localhost:8080/role/addRole
    @PostMapping("/addRole")
    public Roles addRole(@RequestBody Roles role){
        return iRole.addRole(role);
    }

    @PutMapping("/updateRole")
    public Roles updateSkieur(@RequestBody Roles role ){
        return iRole.updateRole(role);
    }

    @GetMapping("/getRoleById/{id}")
    public Roles retrieveUserById(@PathVariable("id") Long id){
        return iRole.retrieveRoleById(id);
    }

    @GetMapping("/getAllRoles")
    public List<Roles> retrieveAllRoles(){
        return iRole.retrieveAllRoles();
    }

    @DeleteMapping("/delRole/{id}")
    public void deleteRole (@PathVariable("id") Long id){
        iRole.deleteRole(id);
    }

    // Affecter un rôle à un utilisasteur
    @PostMapping("/assignRoleToUser/{username}/{roleName}")
    public Roles assignSkieurToPiste(@PathVariable("username") String username, @PathVariable("roleName") String roleName)
    {
        return iRole.assignRoleToUser(username,roleName);
    }


}
