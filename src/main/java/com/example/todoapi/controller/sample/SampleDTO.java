package com.example.todoapi.controller.sample;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class SampleDTO {
    
    private String content;
    private LocalDateTime timestamp;
}
