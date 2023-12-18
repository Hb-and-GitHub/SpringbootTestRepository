package com.hb.demo.test_hb.test_10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import java.util.Locale;

@Component
public class MessageUtils {

    private static MessageSource messageSource;

    private String basename = "classpath:static/messages";

    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageResource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename(basename);
        source.setDefaultEncoding("UTF-8");
        source.setUseCodeAsDefaultMessage(true);
        messageSource = source;
        return source;
    }

    /**
     * 获取单个国际化翻译值
     *
     * @param msgKey
     * @return
     */
    public static String get(String msgKey) {
        try {
            return messageSource.getMessage(msgKey, null, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return msgKey;
        }
    }

    /**
     * 获取单个国际化带参数
     *
     * @param msgKey
     * @param args
     * @return
     */
    public static String get(String msgKey, Object[] args) {
        try {
            return messageSource.getMessage(msgKey, args, LocaleContextHolder.getLocale());
        } catch (Exception e) {
            return msgKey;
        }
    }

    public static String get(String msgKey, Locale locale) {
        try {
            return messageSource.getMessage(msgKey, null, locale);
        } catch (Exception e) {
            return msgKey;
        }
    }
}