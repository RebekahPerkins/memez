package com.rebekahperkins.meme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class SpringConfig {
    public static void main(String[] args) {
        SpringApplication.run(SpringConfig.class, args);
    }
}
