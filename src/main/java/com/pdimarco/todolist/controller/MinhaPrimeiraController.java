package com.pdimarco.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8080
public class MinhaPrimeiraController {

    @GetMapping("/")
    public String PrimeiraMensagem() {
        return "Funcionou";
    }
}
