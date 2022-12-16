package com.example.task311springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.task311springboot.dao.UserDao;
import com.example.task311springboot.model.User;
import com.example.task311springboot.repository.UsersRepository;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl (UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public User findOneUser(long id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public void updateUser(long id, User user) {
        user.setId(id);
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }
}