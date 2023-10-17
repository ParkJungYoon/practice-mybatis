package com.example.mybatis.dto;

import lombok.Data;

@Data
public class AddTodoRequest {
    private String content;
    private String isCompleted;
}
