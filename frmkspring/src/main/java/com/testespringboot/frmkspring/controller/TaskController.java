package com.testespringboot.frmkspring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testespringboot.frmkspring.models.TaskEntity;

@RestController 
@RequestMapping (value = "tasks")
public class TaskController {

    private List<TaskEntity> tasklist = new ArrayList<>();

    public TaskController() {
        tasklist.add(new TaskEntity("Estudar Spring Boot", "Criar o primeiro Controller", false));
        tasklist.add(new TaskEntity("Praticar Java", "Rever conceitos de POO", true));
    }

    @GetMapping 
    public List<TaskEntity> listAllTask() {
        return tasklist;
    }
}
