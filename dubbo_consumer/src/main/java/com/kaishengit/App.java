package com.kaishengit;

import com.kaishengit.controller.HomeController;
import com.kaishengit.service.ProductServcie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring-dubbo-consumer.xml");
        ProductServcie productServcie = (ProductServcie) context.getBean("rpcProductService");
        List<String> productNames = productServcie.findAllProductNames();
        for(String name : productNames) {
            System.out.println(name);
        }
        productServcie.save("hello,Dubbo");*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        HomeController homeController = (HomeController) context.getBean("homeController");
        homeController.sayHello();

        System.in.read();

    }
}
