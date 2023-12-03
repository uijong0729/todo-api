package com.example.todoapi.controller.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapi.controller.TasksApi;
import com.example.todoapi.model.TaskDTO;


@RestController
public class TaskController implements TasksApi{
    
    // postman: localhost:8080/tasks/1
    @Override
    public ResponseEntity<TaskDTO> showTask() {
        var dto = new TaskDTO();
        dto.setId(1L);
        dto.setTitle("title");
        return ResponseEntity.ok(dto);
    }
}
