package com.example.boot;

import com.example.boot.config.SpringConfig;
import com.example.boot.config.SpringMvcConfig;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 最快速整合注解版springmvc和spring的
 *
 * @author: licocon
 * @version: 1.0
 * @since: 2021/10/5 22:10
 */
public class QuickAppStarter extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 根容器的配置(spring的配置类)
     */
    @Nullable
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{SpringConfig.class};
    }

    /**
     * web容器配置(springmvc 的配置类)
     */
    @Nullable
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{SpringMvcConfig.class};
    }

    /**
     * servlet的映射 ,DispatcherServlet的映射路径
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}