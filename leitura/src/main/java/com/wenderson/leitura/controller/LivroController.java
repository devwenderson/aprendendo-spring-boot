package com.wenderson.leitura.controller;

import java.util.List;

import com.wenderson.leitura.domain.Livro;
import com.wenderson.leitura.service.LivroService;
import com.wenderson.leitura.dto.LivroDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/livros")
    public List<Livro> listar() {
        return livroService.listarLivros();
    }

    @GetMapping("/livro")
    public Livro livro() {
        return livroService.livroExemplo();
    }

    @GetMapping("/livros/titulos")
    public List<LivroDTO> listarTitulos() {
        return livroService.listarLivrosDTO();
    }
}
