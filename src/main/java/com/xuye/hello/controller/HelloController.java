package com.xuye.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
/*
@Value("${server.port}")
private String port;

@Value("${book.desc}")
private String bookDesc;

@Value("${book.number}")
private String bookNumber;
*/
    @Autowired
    private CounterService counterService;

    /*@RequestMapping("/hello")
    public Object hello() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello World!" + "\n");
        buffer.append("port:" + this.port + "\n");
        buffer.append("bookDesc:" + this.bookDesc + "\n");
        buffer.append("bookNumber:" + this.bookNumber + "\n");
        System.out.println(buffer.toString());
        return buffer.toString();
    }*/

    //通过actuator获取自定义统计数据。/metrics下的counter类
    @RequestMapping("/count")
    public Object count() {
        this.counterService.increment("test counterService");//访问次数
        return "";
    }
}
