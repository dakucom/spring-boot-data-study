package com.dakuzai.handler;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @program: spring-boot-data-study
 * @description: 国际化处理
 * @author: dakuzai
 * @create: 2020-03-26 17:36
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String language = request.getParameter("l");
        //默认的国际化语言
        Locale locale = Locale.getDefault();
        //处理language
        if (!StringUtils.isEmpty(language)) {
            //分割为一个String类型的数组
            String[] languages = language.split("_");
            locale = new Locale(languages[0], languages[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
