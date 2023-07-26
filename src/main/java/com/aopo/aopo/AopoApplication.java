package com.aopo.aopo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aopo.aopo.domain.mapper")
public class AopoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopoApplication.class, args);
    }

}
