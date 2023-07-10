package com.hb.demo.controller;

import com.hb.demo.enity.user;
import com.hb.demo.enity.vo.Page;
import com.hb.demo.service.userService;
import com.hb.demo.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController//当前类交给springboot管理，并且自动对返回值进行转换
@RequestMapping("/hello")
public class UserController extends BaseController{
    @Resource//自动注入业务层对象
    userService userService;

    @GetMapping()
    public List<user> getUsers(){
        Result<Void> result = new Result<>();
        List<user> users = userService.get_users();
        try {
            List<user> usersum = users;
            result.setState(200);
            result.setMessage("初始化成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(400);
            result.setMessage("未知错误");
        }
        return users;
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody user user){
        userService.insertUser(user);
        return "添加成功";
    }

    @GetMapping("/page")
    public Page getPage(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10")Integer pageSize){
        Page page=userService.findByPage(pageNum, pageSize);
        return page;
    }
}
