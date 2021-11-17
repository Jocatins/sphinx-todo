package com.sphinxtodo.sphinxtodo.repos;

import com.sphinxtodo.sphinxtodo.models.TodoItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<TodoItem, Long> {
  //  TodoItem findByUserName(String userName);

    //TodoItem updateTodoItem(TodoItem items);
//    List<TodoItem> findByTodoDescription(String todoDescription);
//    List<TodoItem> findAllByDone(Boolean done);
}
