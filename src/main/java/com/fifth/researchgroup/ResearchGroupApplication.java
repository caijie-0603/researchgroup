package com.fifth.researchgroup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Lenovo
 */
@SpringBootApplication
@MapperScan("com.fifth.researchgroup.dao")
public class ResearchGroupApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResearchGroupApplication.class, args);
    }

}
