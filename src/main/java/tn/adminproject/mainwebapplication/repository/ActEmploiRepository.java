package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.ActEmploi;
import tn.adminproject.mainwebapplication.models.ActEmploiId;


public interface ActEmploiRepository extends JpaRepository<ActEmploi, ActEmploiId> {
}
