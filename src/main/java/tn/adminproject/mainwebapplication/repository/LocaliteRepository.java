package tn.adminproject.mainwebapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.adminproject.mainwebapplication.models.Localite;

public interface LocaliteRepository extends JpaRepository<Localite,Integer> {
}
