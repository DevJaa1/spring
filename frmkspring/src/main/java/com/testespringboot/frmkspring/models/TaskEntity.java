package com.testespringboot.frmkspring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idTask;
    private String titleTask;
    private String description;
    private boolean completed;

    public TaskEntity(String title, String desc, boolean completed) {
        if (title.isEmpty()) {
            throw new IllegalArgumentException("Set a titile to your task");
        }
        if (desc.isEmpty()) {
            throw new IllegalArgumentException("Set a description to your task");
        }
        this.completed = completed;
        this.titleTask = title;
        this.description = desc;
    }

    public TaskEntity() {
    }

    public String getTitleTask() {
        return titleTask;
    }

    public void setTitleTask(String titleTask) {
        this.titleTask = titleTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

}
