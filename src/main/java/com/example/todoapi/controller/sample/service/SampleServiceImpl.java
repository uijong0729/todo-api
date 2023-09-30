package com.example.todoapi.controller.sample.service;

import org.springframework.stereotype.Service;

import com.example.todoapi.controller.sample.repository.SampleRecord;
import com.example.todoapi.controller.sample.repository.SampleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService {

    private final SampleRepository repo;
    
    @Override
    public SampleEntity find() {
        SampleRecord record = repo.select();
        return new SampleEntity(record.getContent());
    }
}
