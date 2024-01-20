package com.example.todoapi.repository.task;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper // di 컴포넌트로 등록됨
public interface TaskRepository {
    @Select("SELECT id, title FROM tasks ORDER BY id LIMIT 1")
    Optional<TaskRecord> select();
}
