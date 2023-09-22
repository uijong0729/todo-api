package com.example.todoapi.controller.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.todoapi.controller.sample.service.SampleService;
import com.example.todoapi.controller.sample.service.SampleServiceImpl;

@Configuration
public class BeanConfig {
    
    @Bean
    public SampleService sampleService() {
        return new SampleServiceImpl();
    }
}
