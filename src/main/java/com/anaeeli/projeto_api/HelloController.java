package com.anaeeli.projeto_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String saudacao() {
        return "Olá, API funcionando!";
    }
}