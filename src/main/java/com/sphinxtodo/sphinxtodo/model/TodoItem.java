package com.sphinxtodo.sphinxtodo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "todotable")
public class TodoItem {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "validation")
    private boolean done;


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

}
