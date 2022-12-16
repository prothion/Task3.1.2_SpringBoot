package com.example.task311springboot.dao;

import com.example.task311springboot.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User findById(long id);

    public void updateUser(User user);

    public void deleteUser(long id);

}