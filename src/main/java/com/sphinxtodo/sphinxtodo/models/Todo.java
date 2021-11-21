package com.sphinxtodo.sphinxtodo.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "todo_title")
    private String todoTitle;
    @Column(name = "todo_description")
    private String todoDescription;
    @Column(name = "is_done")
    private Boolean isDone;
    @Column(name = "created_at")
    private LocalDate timeCreated = LocalDate.now();
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private Users users;

}
