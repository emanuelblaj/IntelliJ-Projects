package com.emanuel.com_emanuel_spring_data_rest;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String summary;

    private String description;
    private Boolean done;
    private Date dueDate;

    public Todo() {

    }
    public Todo(String summary) {
        this.summary = summary;
    }

    public void setId(long id) {

    }

    public Todo copy() {
        Todo todo = new Todo(summary);
        todo.setDone(getDone());
        todo.setDueDate(getDueDate());
        todo.setDescription(getDescription());

        return todo;
    }
}
