package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hzqiuxm@163.com
 * @Date 2017/9/4 0004 16:17
 */
@Configuration
@EnableConfigurationProperties(CommonProperties.class)
@ConditionalOnClass(MyService.class)
@ConditionalOnProperty(prefix = "hello",value = "enable",matchIfMissing = true)
public class MyServiceAutoConfiguration {
    @Autowired
    private CommonProperties commonProperties;

    @Bean
    @ConditionalOnMissingBean
    public MyService myService(){
        MyService myService = new MyService();
        myService.setMsg(commonProperties.getMsg());

        return myService;
    }
}
