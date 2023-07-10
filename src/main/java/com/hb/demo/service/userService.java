package com.hb.demo.service;

import com.hb.demo.enity.user;
import com.hb.demo.enity.vo.Page;

import java.util.List;

public interface userService {
    List<user> get_users();

    void insertUser(user user);

    Page findByPage(Integer pageNum, Integer pageSize);
}
