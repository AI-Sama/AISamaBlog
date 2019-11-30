package com.blog.aisamablog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.blog.aisamablog.mapper")
public class AisamablogApplication {

    public static void main(String[] args) {
        SpringApplication.run(AisamablogApplication.class, args);
    }


}
