package tn.adminproject.mainwebapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.adminproject.mainwebapplication.security.services.IUser;
import tn.adminproject.mainwebapplication.models.User;
import tn.adminproject.mainwebapplication.repository.*;
import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {
/*
  @Autowired
  IUser iUser;

  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }

  @GetMapping("/guest")
  @PreAuthorize("hasRole('ROLE_MODERATOR') or hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
  public String userAccess() {
    return "Client Content, Available for all.";
  }

  @GetMapping("/mod")
  @PreAuthorize("hasRole('ROLE_MODERATOR')")
  public String moderatorAccess() {
    return "Moderator Board.";
  }

  @GetMapping("/getAllUsers")
  public List<User> retrieveAllUsers(){ return iUser.retrieveAllUsers();
  }

  @GetMapping("/admin")
  @PreAuthorize("hasRole('ROLE_ADMIN')")
  public String adminAccess() {
    return "Admin Board.";
  }
  */
}
