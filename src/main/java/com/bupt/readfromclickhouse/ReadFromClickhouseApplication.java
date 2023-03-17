package com.bupt.readfromclickhouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bupt.readfromclickhouse.mapper")
public class ReadFromClickhouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadFromClickhouseApplication.class, args);
    }

}
