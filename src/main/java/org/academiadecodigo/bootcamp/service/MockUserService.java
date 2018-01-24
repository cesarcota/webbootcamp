package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MockUserService implements UserService {
    Map<String, User> userList = new HashMap<>();
    @Override
    public void addUser(User user) {
        userList.put(user.getUsername(), user);
    }

    @Override
    public void removeUser(User user) {
        if (user    == null){
            return;
        }
        userList.remove(user.getUsername());
    }

    @Override
    public boolean autenticate(String username, String passord) {
        if (username.isEmpty() || username == null){
            return false;
        }
        return findByName(username).getPassword().equals(passord);
    }

    @Override
    public User findByName(String userName) {
        return userList.get(userName);
    }

    @Override
    public List<User> findAll() {
        return new LinkedList<>(userList.values());
    }
}
