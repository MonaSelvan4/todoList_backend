package com.relove.TodoList.controller;

import com.relove.TodoList.model.Todo;
import com.relove.TodoList.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value="/relove/api/v1", produces= MediaType.APPLICATION_JSON_VALUE)
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public List<Todo> getTodos(){
       return todoService.getAllTodos();
    }
    @RequestMapping(value = "/todos/add", method = RequestMethod.POST)
    public List<Todo> addTodo(@RequestBody Todo newTodo){
        return todoService.addTodo(newTodo);
    }
    @RequestMapping(value = "/todos/delete/{todoId}", method = RequestMethod.DELETE)
    public void deleteTodos(@PathVariable Integer todoId){
        todoService.deleteTodo(todoId);
    }
    @RequestMapping(value = "/todos/{priority}", method = RequestMethod.GET)
    public List<Todo> getTodosByPriority(@PathVariable String priority){
        return todoService.getTodoByPriority(priority);
    }
}
