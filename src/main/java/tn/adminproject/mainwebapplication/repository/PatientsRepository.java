package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.cabinetmed.Patients;


import java.util.List;
import java.util.Optional;

public interface PatientsRepository extends JpaRepository<Patients,Long> {

    List<Patients> findAll();

    Optional<Patients> findBymatPat(long matPat);
    Optional<Patients> findByNomContains(String nom); // Patients findByNomContains

}
