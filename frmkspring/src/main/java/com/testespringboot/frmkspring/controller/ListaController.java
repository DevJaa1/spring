package com.testespringboot.frmkspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("v2/listacoisas")
public class ListaController {

    private static final List<String> lista = List.of("coisa1", "coisa2","coisa3");

    @GetMapping 
    public List<String> listCoisas (){
        return lista;
    }

    @GetMapping ("filter")
    public List<String> listaCoisasFiltro(@RequestParam String name) {
        return lista.stream().filter(x -> x.equalsIgnoreCase(name)).toList();
    }

    @GetMapping ({"name"})
    public String findByNameCoisas(@PathVariable String name) {
        return lista.stream().filter(coisa -> coisa.equalsIgnoreCase(name)).findFirst().orElse("");
    }


}
