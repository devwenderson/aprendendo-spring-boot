package com.wenderson.leitura.controller;

import com.wenderson.leitura.service.InicioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioController {

    private final InicioService inicioService;

    public InicioController(InicioService inicioService) {
        this.inicioService = inicioService;
    }

    @GetMapping("/")
    public String inicio() {
        return inicioService.inicio();
    }
}
