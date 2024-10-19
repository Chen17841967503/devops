package com.example.todo.model;
import java.time.LocalDate;
public class Todo {
    private Long id;
    private String description;
    private boolean isCompleted;
    private String priority;
    private LocalDate dueDate;
    // 构造函数、getter和setter省略
    public Todo(Long id, String description,String priority, LocalDate dueDate) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }
    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public boolean isCompleted() {
        return isCompleted;
    }

    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
