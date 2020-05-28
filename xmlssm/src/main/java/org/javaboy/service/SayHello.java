package org.javaboy.service;

import org.springframework.stereotype.Service;

@Service
public class SayHello {

    public String sayHello() {
        return "Hello java boy!";
    }
}
