package com.sphinxtodo.sphinxtodo.services;

import com.sphinxtodo.sphinxtodo.models.Todo;
import com.sphinxtodo.sphinxtodo.repos.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    //GET METHOD
    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    //GET METHOD ID
    public Todo getTodoId(Long id) {
        return todoRepository.findById(id).orElse(new Todo());
    }

    // POST METHOD
    public void postTodo(Todo todo) {
        todoRepository.save(todo);
    }

    //PUT METHOD
    public void updateTodo(Todo todo) {
        System.out.println("Updating");
        todoRepository.save(todo);
    }

    //DELETE
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

}