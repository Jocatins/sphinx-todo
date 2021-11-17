package com.sphinxtodo.sphinxtodo.controllers;

import com.sphinxtodo.sphinxtodo.models.TodoItem;
import com.sphinxtodo.sphinxtodo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/all-todos")
    public List<TodoItem> getAllTodos(){
        return adminService.getAllTodoItems();
    }
    @RequestMapping("/all-todos/{id}")
    public TodoItem getTodoItem(@PathVariable Long id){
        return adminService.getTodoItem(id);
    }
    @PostMapping(value="/add-todo")
    public void addTodo(@RequestBody TodoItem todoItem){
        adminService.addTodo(todoItem);
    }
    @PutMapping(value="/all-todos/{id}")
    public void updateTodo( @RequestBody TodoItem todoItem){
        System.out.println("UPDATED");
        adminService.updateTodo(todoItem);
    }
    @DeleteMapping(value="all-todos/{id}")
    public void deleteTodoItem(@PathVariable Long id){
        adminService.deleteTodoItem(id);
    }
}
