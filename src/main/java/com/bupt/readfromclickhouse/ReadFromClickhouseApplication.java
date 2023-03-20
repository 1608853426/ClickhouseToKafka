package com.bupt.readfromclickhouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.bupt.readfromclickhouse.mapper")
@EnableScheduling
public class ReadFromClickhouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadFromClickhouseApplication.class, args);
    }

}
