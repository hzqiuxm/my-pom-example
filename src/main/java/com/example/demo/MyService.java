package com.example.demo;

/**
 * Copyright © 2016年 author. All rights reserved.
 * 自动配置类会根据此类是否存在来创建这个类的Bean，这个类可以是第三方类库的
 * @Author 临江仙 hzqiuxm@163.com
 * @Date 2017/9/4 0004 16:18
 */

public class MyService {

    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String sayHello(){

        return "Hello " + msg;
    }
}
