package com.example.todoapi.controller.sample.service;

public class SampleServiceImpl implements SampleService {
    @Override
    public SampleEntity find() {
        return new SampleEntity("hello");
    }
}
