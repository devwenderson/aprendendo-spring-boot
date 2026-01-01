package com.wenderson.leitura.service;

import java.util.List;

import com.wenderson.leitura.domain.Livro;
import com.wenderson.leitura.dto.LivroDTO;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    public String listarMensagem() {
        return "Listando livros da aplicação";
    }

    public Livro livroExemplo() {
        return new Livro("Dom Casmurro", "Machado de Assis");
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
