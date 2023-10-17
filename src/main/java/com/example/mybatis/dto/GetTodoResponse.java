package com.example.mybatis.dto;

import lombok.Data;

@Data
public class GetTodoResponse {
    private String content;
    private String isCompleted;
}
