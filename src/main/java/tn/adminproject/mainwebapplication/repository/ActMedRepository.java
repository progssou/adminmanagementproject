package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.ActMed;

public interface ActMedRepository extends JpaRepository<ActMed,String> {
}
