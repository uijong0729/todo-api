package com.example.todoapi.service.task;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    
    public TaskEntity find(long id) {
        return new TaskEntity(id, "from Service");
    }
}
