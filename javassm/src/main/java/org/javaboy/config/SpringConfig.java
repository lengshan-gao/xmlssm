package org.javaboy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/*
* spring 的配置文件
* 只进行包扫描，注入spring 容器  这里扫描除了controller之外的包
* */
@Configuration
@ComponentScan(basePackages = "org.javaboy",useDefaultFilters = true,excludeFilters ={@ComponentScan.Filter(type=
FilterType.ANNOTATION,classes = Controller.class)})
public class SpringConfig {
}
