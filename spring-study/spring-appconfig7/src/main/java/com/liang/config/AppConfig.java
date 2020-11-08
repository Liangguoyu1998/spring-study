package com.liang.config;

import com.liang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
@Configuration
@ComponentScan("com.liang")
@Import(AppConfig2.class)
public class AppConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
