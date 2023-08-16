package tn.adminproject.mainwebapplication.security.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.adminproject.mainwebapplication.models.SharedMenu;
import tn.adminproject.mainwebapplication.repository.SharedMenuRepository;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class SharedMenuServiceImplementation implements SharedMenuService {

     SharedMenuRepository sharedMenuRepository;


    @Autowired
    public SharedMenuServiceImplementation(SharedMenuRepository sharedMenuRepository) {
        this.sharedMenuRepository = sharedMenuRepository;
    }




    @Override
    public SharedMenu createSharedMenu(SharedMenu sharedMenu) {
        return sharedMenuRepository.save(sharedMenu);
    }

    @Override
    public SharedMenu updateSharedMenu(Long id, SharedMenu sharedMenu) {
        return sharedMenuRepository.findById(id)
                .map(existingSharedMenu -> {
                    // Update fields as needed
                    // Example: existingSharedMenu.setEnName(sharedMenu.getEnName());
                    // ... similar for other fields ...
                    return sharedMenuRepository.save(existingSharedMenu);
                })
                .orElse(null); // Handle case when the menu is not found
    }

    @Override
    public SharedMenu retrieveSharedMenu(Long id) {
        return sharedMenuRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSharedMenu(Long id) {
        sharedMenuRepository.deleteById(id);
    }

    @Override
    public List<SharedMenu> getAllSharedMenus() {
        return sharedMenuRepository.findAll();
    }

    @Override
    public SharedMenu getSharedMenuById(Long id) {
        return sharedMenuRepository.findById(id).orElse(null);
    }


    public SharedMenu getRecursiveMenuById(Long id) {
        SharedMenu menu = sharedMenuRepository.findById(id).orElse(null);
        if (menu != null) {
            initializeChildren(menu);
        }
        return menu;
    }

    private void initializeChildren(SharedMenu menu) {
        List<SharedMenu> children = sharedMenuRepository.findByParentMenu(menu);
        for (SharedMenu child : children) {
            initializeChildren(child);
        }
        menu.setChildren(children);
    }


}
