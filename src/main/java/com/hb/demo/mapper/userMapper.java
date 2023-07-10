package com.hb.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hb.demo.enity.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface userMapper{

    @Select("select * from user")
    List<user> getUsers();

    @Insert("insert into user(name,address,age,sex,phone) values (#{name},#{address},#{age},#{sex},#{phone})")
    void insertUsers(user user);

    @Select("select * from user limit #{offset},#{pageSize}")
    List<user> findByPage(Integer offset,Integer pageSize);

    @Select("select count(id) from user")
    Integer countUsers();
}
