package com.wenderson.leitura.service;

import org.springframework.stereotype.Service;

@Service
public class InicioService {
    public String inicio() {
        return "Bem-vindo à aplicação de leitura";
    }
}
