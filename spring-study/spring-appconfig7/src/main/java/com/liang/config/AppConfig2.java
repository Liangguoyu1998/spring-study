package com.liang.config;

import com.liang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
@Configuration
public class AppConfig2 {
    @Bean
    public User user(){
        return new User();
    }
}
