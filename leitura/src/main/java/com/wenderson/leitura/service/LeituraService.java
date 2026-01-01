package com.wenderson.leitura.service;

import org.springframework.stereotype.Service;

@Service
public class LeituraService {
    public String mensagemInicial() {
        return "Bem-vindo à aplicação de leitura (service)";
    }

    public String listarMensagem() {
        return "Listando livros da aplicação";
    }
}
