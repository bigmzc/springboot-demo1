package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* @SpringBootApplication=@Configuration+@EnableAutoConfiguration+@ComponentScan
* @ComponentScan默认扫描同级包
*/

@SpringBootApplication
@MapperScan("com.baizhi.mapper")
public class App {
    public static void main(String[] args) {
        System.out.println("change in github");
        SpringApplication.run(App.class,args);
    }
}
