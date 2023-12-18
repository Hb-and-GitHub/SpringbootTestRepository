package com.hb.demo;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.sql.SQLOutput;

@Getter
@AllArgsConstructor
public enum TestEnum implements IEnum<Byte> {
    SUBJECT((byte)1,"受试者");

    private final Byte value;
    private final String desc;


    @JsonValue
    @Override
    public Byte getValue() {
        return this.value;
    }

    public static TestEnum getByCode(Byte code) {
        for (TestEnum e : TestEnum.values()) {
            if (e.getValue().equals(code)) {
                return e;
            }
        }
        return null;
    }

    public static void main (String[] args){
        System.out.println(TestEnum.SUBJECT.getDesc());
        System.out.println(TestEnum.getByCode((byte) 1));
    }
}
