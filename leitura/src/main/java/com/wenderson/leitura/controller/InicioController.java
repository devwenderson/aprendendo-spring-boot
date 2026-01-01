package com.wenderson.leitura.controller;

import com.wenderson.leitura.service.LeituraService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    // TODO:
    // Crie um endpoint GET em "/"
    // que retorne a String:
    // "Bem-vindo à aplicação de leitura"

    private final LeituraService leituraService;

    public InicioController(LeituraService leituraService) {
        this.leituraService = leituraService;
    }

    @GetMapping("/")
    public String inicio() {
        return leituraService.mensagemInicial();
    }
}
