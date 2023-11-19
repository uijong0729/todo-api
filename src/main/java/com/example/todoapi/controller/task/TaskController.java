package com.example.todoapi.controller.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapi.controller.TasksApi;


@RestController
public class TaskController implements TasksApi{
    
    // postman: localhost:8080/tasks/1
    @Override
    public ResponseEntity<Void> tasks1Get() {
        return ResponseEntity.ok().build();
    }
}
