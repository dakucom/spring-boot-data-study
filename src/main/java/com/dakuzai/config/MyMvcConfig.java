package com.dakuzai.config;

import com.dakuzai.handler.MyLocaleResolver;
import com.dakuzai.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: spring-boot-mybatis-scaffold
 * @description: mvcConfig
 * @author: dakuzai
 * @create: 2020-03-25 14:49
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    /**
     * 编写一个视图解析，路由！
     * 视图跳转控制
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("login");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    /**
     * 登录拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截器需要放行第一次登录的请求，否则就用户为null 了
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/index.html","/","index","/asserts/**","/user/login");
    }
    /**
     * 注册国际化到IOC中
     * @return
     */
    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
