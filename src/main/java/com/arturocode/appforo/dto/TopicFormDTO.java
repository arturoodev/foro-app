package com.arturocode.appforo.dto;

import lombok.Data;

@Data
public class TopicFormDTO {
    private String name;
    private String message;
    private Long courseId;
    private Long userId;
}
