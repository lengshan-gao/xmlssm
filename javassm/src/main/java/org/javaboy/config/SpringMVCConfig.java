package org.javaboy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/*
* spring mvc的配置文件
*
* 只进行包扫描，注入spring mvc容器   这里只扫描controller下面的类
* */
@Configuration
@ComponentScan(basePackages = "org.javaboy",useDefaultFilters = false, includeFilters = {@ComponentScan.Filter(type =
FilterType.ANNOTATION,classes = Controller.class)})
public class SpringMVCConfig {
}
