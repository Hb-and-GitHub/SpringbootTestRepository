package com.hb.demo.config;

import lombok.Data;

@Data
public class Student {
    private String name;
    private Integer age;

    public Student(String s, int i) {
        this.name=s;
        this.age = i;
    }
}
