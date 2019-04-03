package com.neuedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2019/4/3.
 */
@SpringBootApplication
@MapperScan("com.neuedu.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
