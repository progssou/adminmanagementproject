package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.CentreMedical;

public interface CentreMedicalRepository extends JpaRepository<CentreMedical,Integer> {
}
