package com.testespringboot.frmkspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class atividadeController {

    @RequestMapping (value = "v1/lista")
    public List<String> listAll() {
        return List.of("One","Two","Tree");

    }
}
