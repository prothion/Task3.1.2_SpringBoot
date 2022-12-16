package com.example.task311springboot.service;

import com.example.task311springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User findOneUser(long id);

    public void updateUser(long id, User user);

    public void deleteUser(long id);
}