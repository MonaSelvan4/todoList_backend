package com.relove.TodoList.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Todo {
    @Id
    @Column
    private int todoId;
    @Column
    private String todoName;
    @Column
    private String todoDescription;
    @Column
    private String todoPriority;
    public String getPriority() {
        return todoPriority;
    }
}
