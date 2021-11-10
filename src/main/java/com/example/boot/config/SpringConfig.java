package com.example.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 不扫描controller组件
 * spring的父容器
 *
 * @author: licocon
 * @version: 1.0
 * @since: 2021/10/3 16:27
 */
@Configuration
@ComponentScan(value = "com.example.boot", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)
})
public class SpringConfig {

}