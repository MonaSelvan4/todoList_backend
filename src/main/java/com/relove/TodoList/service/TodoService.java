package com.relove.TodoList.service;

import com.relove.TodoList.model.Todo;
import com.relove.TodoList.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoRepository todoRepository;

    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
    public List<Todo> addTodo(Todo newTodo){
        todoRepository.save(newTodo);
        return todoRepository.findAll();
    }
    public void deleteTodo(Integer todoId){
        todoRepository.deleteById(todoId);
    }
    public List<Todo> getTodoByPriority(String priority){
        return todoRepository.findByTodoPriority(priority);
    }
}
