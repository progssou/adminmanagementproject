package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.Medorg;

public interface MedorgRepository extends JpaRepository<Medorg,Integer> {
}
