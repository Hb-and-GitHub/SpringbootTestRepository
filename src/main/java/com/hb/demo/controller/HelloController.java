package com.hb.demo.controller;

import com.hb.demo.service.helloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private helloService helloservice;

   @RequestMapping("/helloworld")
    public  String helloworld(){
       int x = 1;
       int y =2;

       String word = helloservice.helloCon();
       return word;
   }
}
