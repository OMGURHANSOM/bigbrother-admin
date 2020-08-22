package com.nine.bigbrother.service.impl;

import com.nine.bigbrother.dao.UserDAO;
import com.nine.bigbrother.entity.User;
import com.nine.bigbrother.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserDAO userDAO;
    @Override
    public List<User> getUserInfo() {
        return userDAO.getUserInfo();
    }

}
