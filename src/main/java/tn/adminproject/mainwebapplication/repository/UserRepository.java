package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.adminproject.mainwebapplication.models.*;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username); // User findByUsername
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    List<User> findByAddress(String address);
    List<User> findByStateUser(boolean stateUser);
}

