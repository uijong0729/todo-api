package com.example.todoapi.controller.sample;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todoapi.controller.sample.service.SampleService;
import com.example.todoapi.controller.sample.service.SampleServiceImpl;

import lombok.RequiredArgsConstructor;

// RestController = Controller + ResponseBody
// ResponseBody = 컨트롤러의 return이 responseBody로 그대로 반환 됨
@RequestMapping("/samples")
@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService service;
    
    // GET http://localhost:8080/samples
    @GetMapping
    public SampleDTO index() {
        var entity = service.find();
        SampleDTO dto = new SampleDTO();
        dto.setContent(entity.getContent());
        dto.setTimestamp(LocalDateTime.now());
        return dto;
    }
}
