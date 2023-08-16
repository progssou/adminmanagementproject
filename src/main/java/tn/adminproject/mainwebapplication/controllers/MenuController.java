package tn.adminproject.mainwebapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.adminproject.mainwebapplication.models.SharedMenu;
import tn.adminproject.mainwebapplication.security.services.SharedMenuService;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    private final SharedMenuService sharedMenuService;

    @Autowired
    public MenuController(SharedMenuService sharedMenuService) {
        this.sharedMenuService = sharedMenuService;
    }

    @GetMapping
    public List<SharedMenu> getAllSharedMenus() {
        return sharedMenuService.getAllSharedMenus();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SharedMenu> getSharedMenuById(@PathVariable Long id) {
        SharedMenu sharedMenu = sharedMenuService.getSharedMenuById(id);
        if (sharedMenu == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(sharedMenu);
    }

}
