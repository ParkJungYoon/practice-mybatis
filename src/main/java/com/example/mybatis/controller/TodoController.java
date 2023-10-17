package com.example.mybatis.controller;

import com.example.mybatis.dto.AddTodoRequest;
import com.example.mybatis.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoServiceImpl;

    @PostMapping("/todo")
    public void addTodo(
            @RequestBody AddTodoRequest todo
    ) {
        todoServiceImpl.addTodo(todo);
    }
}
