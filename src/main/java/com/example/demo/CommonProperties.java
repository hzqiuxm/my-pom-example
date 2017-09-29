package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hzqiuxm@163.com
 * @Date 2017/9/4 0004 16:13
 */
@ConfigurationProperties(prefix = "hello")
public class CommonProperties {

    private static final String MSG = "world!";
    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
