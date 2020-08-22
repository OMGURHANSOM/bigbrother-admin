package com.nine.bigbrother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nine.bigbrother.dao")
public class BigbrotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigbrotherApplication.class, args);
    }

}
