package tn.adminproject.mainwebapplication.security.services;

import org.springframework.security.core.userdetails.UserDetails;
import tn.adminproject.mainwebapplication.models.ERole;
import tn.adminproject.mainwebapplication.models.User;

import java.util.List;

public interface IUser {
    User addUser(User user);
    User updateUser(User user);
    User retrieveUserById(Long id);

    List<User> retrieveAllUsers();
    void deleteUser(Long id);
    // void forgotpass(String emailuser);
    void addRoleToUser(String username, ERole roleName);

    boolean ifEmailExist(String email);

    User getUserByMail(String mail);

    //**********Partie Statistiques***********
    List<User> retrieveUserByAddress(String adressUser);
    public long retrieveUserByCount();

    // Mot de passe à jour
    String updatePassword(String emailUser, String newPassword, String confirmPassword);
    // Mot de passe oublié
    void forgotpass(String emailuser);

}