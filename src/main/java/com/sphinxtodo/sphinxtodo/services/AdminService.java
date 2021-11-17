package com.sphinxtodo.sphinxtodo.services;

import com.sphinxtodo.sphinxtodo.models.TodoItem;
import com.sphinxtodo.sphinxtodo.repos.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    //GET METHOD
    public List<TodoItem> getAllTodoItems() {
        List<TodoItem> todoItemList = new ArrayList<>();
        adminRepository.findAll().forEach(todoItemList::add);
        return todoItemList;
    }

    public TodoItem getTodoItem(Long id) {
        return adminRepository.findById(id).orElse(new TodoItem());
    }

    // POST METHOD
    public void addTodo(TodoItem todoItem) {
        adminRepository.save(todoItem);
    }

    //PUT METHOD
    public void updateTodo(TodoItem todoItem) {
        System.out.println("Updating");
//        Optional<TodoItem> item = adminRepository.findById(todoItem.getId());
        adminRepository.save(todoItem);

    }

    //DELETE
    public void deleteTodoItem(Long id) {
        adminRepository.deleteById(id);
    }

}