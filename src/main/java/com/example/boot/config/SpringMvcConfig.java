package com.example.boot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 只扫描controller组件
 * springmvc的子容器，能扫描到Spring中的组件
 *
 * @author: licocon
 * @version: 1.0
 * @since: 2021/10/5 22:13
 */
@ComponentScan(value = "com.example.boot", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)
}, useDefaultFilters = false)
public class SpringMvcConfig {

}