package tn.adminproject.mainwebapplication.repository;

import tn.adminproject.mainwebapplication.models.SharedMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface SharedMenuRepository extends JpaRepository<SharedMenu, Long>{

    List<SharedMenu> findAll();

    Optional<SharedMenu> findByid(long id);
    Optional<SharedMenu> findByfrName(String frname); // SharedMenu findByfrName
    Boolean existsByactive(Integer active);
    boolean existsByFrName(String frName);
    List<SharedMenu> findByEnName(String enName);

    List<SharedMenu> findByParentMenu(SharedMenu menu);
}
