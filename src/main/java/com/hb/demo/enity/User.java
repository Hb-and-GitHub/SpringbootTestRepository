package com.hb.demo.enity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hb.demo.aop.IgnoreTimeZoneHanding;
import com.hb.demo.config.DiyLocalDatetimeSerializer;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private  Integer age;
    private String address;
    private String phone;
    private String sex;

    // @JsonSerialize(using = DiyLocalDatetimeSerializer.class)
    @IgnoreTimeZoneHanding
    private LocalDateTime time;
}
