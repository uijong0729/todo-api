package com.example.todoapi.controller.sample.repository;

import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {
    
    public SampleRecord select() {
        return new SampleRecord("hello world");
    }
}
