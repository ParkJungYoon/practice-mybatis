package com.example.mybatis.service.serviceImpl;

import com.example.mybatis.dto.AddTodoRequest;
import com.example.mybatis.mapper.TodoMapper;
import com.example.mybatis.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoMapper todoMapper;

    @Override
    public void addTodo(AddTodoRequest todo) {
        todoMapper.save(todo);
    }
}