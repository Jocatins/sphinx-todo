package com.sphinxtodo.sphinxtodo.controllers;

import com.sphinxtodo.sphinxtodo.models.Todo;
import com.sphinxtodo.sphinxtodo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping(value = "/users/{id}/todos")
    public List<Todo> getAllTodo(@PathVariable(value = "id") Long userId) {
        System.out.println(userId);
        // use the user id to find all the todos
        return todoService.getAllTodo();
    }

    @GetMapping(value = "/users/{users-id}/todos/{id}")
    public Todo getTodoId(@PathVariable Long id) {
        return todoService.getTodoId(id);
    }

    @PostMapping(value = "/users/todos")
    public void postTodo(@RequestBody Todo todo) {
        todoService.postTodo(todo);

    }

    @PutMapping(value = "/users/{users-id}/todos/{id}")
    public void updateTodo(@RequestBody Todo todo, @PathVariable Long id, @RequestBody Long users) {
        System.out.println("UPDATED");
        todoService.updateTodo(todo);
    }

    @DeleteMapping(value = "/users/{users-id}/todos/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoService.deleteTodo(id);
    }
}
