package com.wenderson.leitura.service;

import java.util.List;

import com.wenderson.leitura.dto.LivroDTO;
import com.wenderson.leitura.domain.Livro;
import com.wenderson.leitura.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> listar() {
        return livroRepository.findAll();
    }

    public Livro criar(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> listarLivros() {
        return List.of(
                new Livro("Percy Jackson", "Rick Riordan"),
                new Livro("Evangelho segundo São João", "São João")
        );
    }

    public List<LivroDTO> listarLivrosDTO() {
        return listarLivros().stream()
                .map(livro -> new LivroDTO(livro.getTitulo()))
                .toList();
    }
}
