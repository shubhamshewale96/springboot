package com.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        System.out.println("welcome to spring boot");
       ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

    }
}
