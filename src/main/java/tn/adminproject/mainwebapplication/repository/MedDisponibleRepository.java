package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.MedDisponible;

public interface MedDisponibleRepository extends JpaRepository<MedDisponible,String> {
}
