package com.assessment;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author FishLi
 * @describe TODO
 * @date 2021-09-14 16:27
 */
@SpringBootApplication
@MapperScan(basePackages = "com.assessment.mapper")
@ComponentScan(basePackages = {"com.assessment","org.n3r.idworker"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
