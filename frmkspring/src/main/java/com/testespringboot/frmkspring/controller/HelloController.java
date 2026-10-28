package com.testespringboot.frmkspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class HelloController {

    @GetMapping("hi")
    public String helloWorld() {
        return "Nothing";
    }

}
