package com.hb.demo.mapper;

import com.hb.demo.enity.User;
import com.hb.demo.enity.vo.Class;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface userMapper{

    @Select("select * from user")
    List<User> getUsers();

    @Insert("insert into user(name,address,age,sex,phone) values (#{name},#{address},#{age},#{sex},#{phone})")
    void insertUsers(User user);

    @Select("select * from user limit #{offset},#{pageSize}")
    List<User> findByPage(Integer offset, Integer pageSize);

    @Select("select count(id) from user")
    Integer countUsers();


    List<Class> verifyPhone(String id);

    @Update("ALTER TABLE user DROP COLUMN test")
    void alterTable();

    @Insert("insert into user(name,address,age,sex,phone) values (#{name},#{address},#{age},#{sex},#{phone})")
    void insertUserList();

}
