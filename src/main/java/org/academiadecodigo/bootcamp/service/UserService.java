package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void removeUser(User user);
    boolean autenticate(String username, String passord);
    User findByName(String unserName);
    List<User> findAll();
}
