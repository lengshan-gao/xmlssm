package org.javaboy.controller;

import org.javaboy.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //注入service
    @Autowired
    SayHello sayHello;

    @GetMapping(value = "/hello",produces = "text/html;charset=utf-8")
    public String sayHello(){
        return sayHello.sayHello();
    }
}
