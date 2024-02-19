package com.hb.demo.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.hb.demo.aop.IgnoreTimeZoneHanding;
import com.hb.demo.enity.SerializerField;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ReflectionUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Slf4j
public class DiyLocalDatetimeSerializer extends JsonSerializer<LocalDateTime> {

    public static final String DEFAULT_DATE_TIME_FORMAT_WITH_TIME_ZONE = "yyyy-MM-dd HH:mm:ss OOOO";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT_WITH_TIME_ZONE);
    private static final DateTimeFormatter formatterNew = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");


    /**
     *
     * @param localDateTime
     * @param jsonGenerator
     * @param serializerProvider
     * @throws IOException
     */
    @Override
    public void serialize(LocalDateTime localDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        SerializerField serializerField = serializerField(jsonGenerator);
        if (isIgnore(serializerField)) {
            log.info("ignore timeZone handing:{},{}",serializerField,localDateTime);
            String format = formatterNew.format(localDateTime);
            jsonGenerator.writeString(format);
            return;
        }
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        String format = formatter.format(zonedDateTime);
        jsonGenerator.writeString(format);

    }

    public static SerializerField serializerField(JsonGenerator gen) {
        JsonStreamContext outputContext = gen.getOutputContext();
        if (Objects.isNull(outputContext)) {
            return null;
        }
        Object currentValue = outputContext.getCurrentValue();
        if (Objects.isNull(currentValue)) {
            return null;
        }
        return new SerializerField()
                .setCurrentClass(currentValue.getClass())
                .setFieldName(outputContext.getCurrentName());
    }

    public static boolean isIgnore(SerializerField serializerField){
        if(Objects.isNull(serializerField)){
            return false;
        }
        if(!serializerField.effective()){
            return false;
        }
        Field field = ReflectionUtils.findField(serializerField.getCurrentClass(), serializerField.getFieldName());
        if(Objects.isNull(field)){
            return false;
        }
        IgnoreTimeZoneHanding annotation = field.getAnnotation(IgnoreTimeZoneHanding.class);
        return !Objects.isNull(annotation);

    }

    // public static void serialize(ZonedDateTime value, JsonGenerator g) throws IOException {
    //     String format = formatter.format(value);
    //     g.writeString(format.replace("GMT","UTC"));
    // }
    //
    // public static SerializerField serializerField(JsonGenerator gen) {
    //     JsonStreamContext outputContext = gen.getOutputContext();
    //     if (Objects.isNull(outputContext)) {
    //         return null;
    //     }
    //     Object currentValue = outputContext.getCurrentValue();
    //     if (Objects.isNull(currentValue)) {
    //         return null;
    //     }
    //     return new SerializerField()
    //             .setCurrentClass(currentValue.getClass())
    //             .setFieldName(outputContext.getCurrentName());
    // }
}
