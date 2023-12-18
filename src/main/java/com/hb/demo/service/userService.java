package com.hb.demo.service;

import com.hb.demo.enity.User;
import com.hb.demo.enity.vo.Page;

import java.util.List;

public interface userService {
    List<User> get_users();

    void insertUser(User user);

    Page findByPage(Integer pageNum, Integer pageSize);
}
