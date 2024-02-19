package com.hb.demo.enity;

import io.micrometer.core.instrument.util.StringUtils;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Objects;

/**
 * 当前序列化的类信息
 */
@Data
@Accessors(chain = true)
public class SerializerField {
    private String fieldName;
    private Class<?> currentClass;
    public boolean effective() {
        return Objects.nonNull(currentClass) && StringUtils.isNotEmpty(fieldName);
    }

    @Override
    public String toString() {
        if (effective()) {
            return currentClass.getName() + " " + fieldName;
        }
        return "";
    }

}