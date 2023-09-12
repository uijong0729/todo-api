package com.example.todoapi.controller.sample;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController = Controller + ResponseBody
// ResponseBody = 컨트롤러의 return이 responseBody로 그대로 반환 됨
@RequestMapping("/samples")
@RestController
public class SampleController {
    
    // GET http://localhost:8080/samples
    @GetMapping
    public SampleDTO index() {
        SampleDTO dto = new SampleDTO();
        dto.setContent("content");
        dto.setTimestamp(LocalDateTime.now());
        return dto;
    }
}
