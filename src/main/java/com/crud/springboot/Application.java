package com.crud.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.crud.springboot"})
public class Application {
    public static void main(String[] arg){
        SpringApplication.run(Application.class,arg);
        //dummy 1 changes
    }
}
