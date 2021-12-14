package com.springboot.springboot;

import com.springboot.springboot.component.DemoBean;
import com.springboot.springboot.component.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        System.out.println("welcome to spring boot");
        ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);

        EmployeeBean employeeBean =context.getBean(EmployeeBean.class);
        employeeBean.setEid(1);
        employeeBean.setEname("shubham");
        employeeBean.showEmployeeDetails();

    }
}
