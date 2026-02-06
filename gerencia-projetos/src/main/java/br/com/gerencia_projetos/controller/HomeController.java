package br.com.gerencia_projetos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
    @GetMapping("/api")
    public String home() {
        return "Rotas da API:  <br> api/usuarios <br> api/projetos <br>";
    }
    
}
