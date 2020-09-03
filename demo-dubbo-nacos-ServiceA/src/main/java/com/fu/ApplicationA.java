package com.fu;

import com.fu.config.DruidDataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 */
@SpringBootApplication

@Import(DruidDataSourceConfig.class)
public class ApplicationA {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationA.class);
    }
}
