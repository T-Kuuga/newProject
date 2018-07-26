package com.lanou.service.impl;

import com.lanou.dao.UserMapper;
import com.lanou.model.User;
import com.lanou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userSerivce")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }
}
