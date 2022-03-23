package com.example.dao.service;

import com.example.dao.dao.UserMapper;
import com.example.dao.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll() {
        return userMapper.selectAll();
    }
}
