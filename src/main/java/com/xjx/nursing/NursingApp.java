package com.xjx.nursing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.xjx.nursing.mapper")
public class NursingApp {
    public static void main(String[] args){
        //aaa
        SpringApplication.run(NursingApp.class,args);
    }
}