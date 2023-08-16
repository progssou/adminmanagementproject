package tn.adminproject.mainwebapplication.security.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Scheduled;
import tn.adminproject.mainwebapplication.models.SharedMenu;

import java.util.List;

public interface SharedMenuService  {

    SharedMenu createSharedMenu(SharedMenu sharedMenu);
    SharedMenu updateSharedMenu(Long id, SharedMenu sharedMenu);
    SharedMenu retrieveSharedMenu(Long id);
    void deleteSharedMenu(Long id);
    List<SharedMenu> getAllSharedMenus();
    SharedMenu getSharedMenuById(Long id);

}
