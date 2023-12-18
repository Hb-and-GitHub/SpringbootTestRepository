package com.hb.demo.enity.vo;

import com.hb.demo.enity.User;
import lombok.Data;

import java.util.List;

@Data
public class Class {
    private String cname;

    private Integer id;

    private  String caddress;

    private  String cphone;

    private  Integer userid;

    private  String sces;

    private List<User> users;
}
