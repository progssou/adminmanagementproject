package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  tn.adminproject.mainwebapplication.models.*;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Roles,Long> {

    // Find a Role by its name for an Admin
    Optional<Roles> findByName(ERole roleAdmin);
}

