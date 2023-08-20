package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.adminproject.mainwebapplication.models.cabinetmed.Patient;

import java.util.List;

@Repository
public interface PatientsRepository extends JpaRepository<Patient, Long> {

    List<Patient> findAll();

    Patient save(Patient patient);

    Patient getPatientsById(Long id);



    void deletePatientsById(Long id);

}
