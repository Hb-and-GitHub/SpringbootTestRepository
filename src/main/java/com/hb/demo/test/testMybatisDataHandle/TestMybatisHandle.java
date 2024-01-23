package com.hb.demo.test.testMybatisDataHandle;

import com.hb.demo.mapper.userMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestMybatisHandle {

    @Resource
    private userMapper userMapper1;

    // @PostMapping("/testInsert")
    // public String insertData(){
    //     for(int i = 1;i<300001;i++){
    //
    //     }
    // }

}
