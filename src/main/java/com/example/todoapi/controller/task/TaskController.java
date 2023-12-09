package com.example.todoapi.controller.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapi.controller.TasksApi;
import com.example.todoapi.model.TaskDTO;
import com.example.todoapi.service.task.TaskService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TaskController implements TasksApi {
    
    private final TaskService taskService;

    // postman: localhost:8080/tasks/1
    @Override
    public ResponseEntity<TaskDTO> showTask() {
        var entitiy = taskService.find(1L);

        var dto = new TaskDTO();
        dto.setId(entitiy.getId());
        dto.setTitle(entitiy.getTitle());
        
        return ResponseEntity.ok(dto);
    }
}
