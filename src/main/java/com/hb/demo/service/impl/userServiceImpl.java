package com.hb.demo.service.impl;

import com.hb.demo.enity.User;
import com.hb.demo.enity.vo.Page;
import com.hb.demo.service.userService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service//交给spring 管理，能够自动生成对象
public class userServiceImpl implements userService {
    @Resource
    com.hb.demo.mapper.userMapper userMapper;


    @Override
    public List<User> get_users() {
        return userMapper.getUsers();
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUsers(user);
    }

    @Override
    public Page findByPage(Integer pageNum, Integer pageSize) {

            Integer offset = (pageNum-1)*pageSize;
            List<User> Users = userMapper.findByPage(offset, pageSize);
            Page<User> page = new Page<>();
            page.setData(Users);
        try {
            Integer total = userMapper.countUsers();
            page.setTotal(total);
            page.setPageSize(pageSize);
            page.setPageNum(pageNum);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return  page;
    }
}
