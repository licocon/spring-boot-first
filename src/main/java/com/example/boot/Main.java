package com.example.boot;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

/**
 * tomcat启动，spi机制下QuickAppStarter 生效，创建ioc容器，配置DispatcherServlet等各种组件
 *
 * @author licocon
 * @since 2021/11/10 14:36
 */
public class Main {


    public static void main(String[] args) throws LifecycleException, ServletException {
        //自己写tomcat的启动源码
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8888);
        tomcat.setHostname("localhost");
        tomcat.setBaseDir(".");
        Context context = tomcat.addWebapp("/boot", System.getProperty("user.dir") + "/src/main");


        //给tomcat添加servlet
        //自己创建DispatcherServlet对象，创建ioc容器，DispatcherServlet里面有ioc容器
        //DispatcherServlet dispatcherServlet = new DispatcherServlet();
        //Wrapper hello = tomcat.addServlet("/boot", "hello", new HelloServlet());
        //Wrapper hello = tomcat.addServlet("/", "hello", dispatcherServlet);
        //hello.addMapping("/");
        //利用tomcat  注解版MVC利用Tomcat  Spi机制

        //启动tomcat


        tomcat.start();


        tomcat.getServer().await();
    }

}