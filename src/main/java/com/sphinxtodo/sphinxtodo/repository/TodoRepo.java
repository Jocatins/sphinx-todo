package com.sphinxtodo.sphinxtodo.repository;

import com.sphinxtodo.sphinxtodo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
