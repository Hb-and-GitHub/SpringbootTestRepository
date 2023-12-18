package com.hb.demo.controller;

import com.hb.demo.enity.User;
import com.hb.demo.enity.vo.Class;
import com.hb.demo.enity.vo.Page;
import com.hb.demo.mapper.userMapper;
import com.hb.demo.service.userService;
import com.hb.demo.test_hb.test_10.BaseResult;
import com.hb.demo.test_hb.test_10.MessageUtils;
import com.hb.demo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.nio.ch.ThreadPool;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Api("测试接口")
@RestController//当前类交给springboot管理，并且自动对返回值进行转换
@RequestMapping("/hello")
public class UserController{
    @Resource//自动注入业务层对象
    userService userService;

    @Resource
    private userMapper userMapper;


    @ApiOperation("测试swagger功能")
    @GetMapping("/testResult")
    public BaseResult testNews(Integer num) {
        Thread thread = new Thread(() -> {
            List<User> list = new ArrayList<>();
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName()+":接口文档测试成功");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"myTestThread");
        thread.start();
        // ExecutorService executorService = Executors.newFixedThreadPool(1);
        // executorService.submit(() -> {
        //     try {
        //         ThreadTest.sleep(5000);
        //         System.out.println(ThreadTest.currentThread().getName()+":我也好了");
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // });
        return BaseResult.success("开始循环");
    }

    @GetMapping()
    public List<User> getUsers(){
        Result<Void> result = new Result<>();
        List<User> Users = userService.get_users();
        System.out.println(Users);
        try {
            List<User> usersum = Users;
            result.setState(200);
            result.setMessage("初始化成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(400);
            result.setMessage("未知错误");
        }
        return Users;
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody User user){
        userService.insertUser(user);
        return "添加成功";
    }

    @GetMapping("/page")
    public Page getPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10")Integer pageSize){
        Page page=userService.findByPage(pageNum, pageSize);
        return page;
    }

    @GetMapping("/result")
    public List<Class> getResult(@RequestParam String id){
        List<Class> list = userMapper.verifyPhone(id);
        System.out.println(list);
        return list;
    }

    @GetMapping("/login")
    public String login(String username ,String password){
        System.out.println("接收到的用户名："+username);
        System.out.println("密码："+password);
        if("111".equals(username) && "111".equals(password)){
            return "登录i成功";
        }
        else{
            return "请重试";
        }

    }
}
