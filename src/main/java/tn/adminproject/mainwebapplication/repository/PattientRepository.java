package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.cabinetmed.Pattient;

public interface PattientRepository extends JpaRepository<Pattient,Integer> {
}
