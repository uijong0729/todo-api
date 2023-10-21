package com.example.todoapi.controller.sample.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SampleRepository {
    
    @Select("SELECT * FROM samples ORDER BY id LIMIT 1")
    SampleRecord select();
}
