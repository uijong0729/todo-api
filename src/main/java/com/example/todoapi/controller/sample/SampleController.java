package com.example.todoapi.controller.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController = Controller + ResponseBody
// ResponseBody = 컨트롤러의 return이 responseBody로 그대로 반환 됨
@RequestMapping("/samples")
@RestController
public class SampleController {
    
    // GET /samples
    @GetMapping
    public String index() {
        return "OK";
    }
}
