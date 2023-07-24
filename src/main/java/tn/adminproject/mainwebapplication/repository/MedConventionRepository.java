package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.MedConvention;

public interface MedConventionRepository extends JpaRepository<MedConvention,Integer> {
}
