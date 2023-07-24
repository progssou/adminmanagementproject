package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.MedSpec;

public interface MedSpecRepository extends JpaRepository<MedSpec,Integer> {
}
