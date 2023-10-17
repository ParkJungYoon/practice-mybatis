package com.example.mybatis.mapper;

import com.example.mybatis.dto.AddTodoRequest;
import com.example.mybatis.dto.GetTodoResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    void save(AddTodoRequest todo);

    List<GetTodoResponse> findAll();

    GetTodoResponse findById(Long id);
}