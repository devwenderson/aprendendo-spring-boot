package com.wenderson.leitura.controller;

import java.util.List;

import com.wenderson.leitura.domain.Livro;
import com.wenderson.leitura.service.LivroService;
import com.wenderson.leitura.dto.LivroDTO;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livros/")
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<Livro> listar() {
        return livroService.listar();
    }

    @PostMapping
    public Livro criar(@RequestBody Livro Livro) {
        return livroService.criar(Livro);
    }

    @GetMapping("titulos/")
    public List<LivroDTO> listarTitulos() {
        return livroService.listarLivrosDTO();
    }
}
