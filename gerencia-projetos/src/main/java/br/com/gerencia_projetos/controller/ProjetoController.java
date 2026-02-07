package br.com.gerencia_projetos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerencia_projetos.domain.Projeto;
import br.com.gerencia_projetos.service.ProjetoService;
import br.com.gerencia_projetos.dto.ProjetoRequestDTO;
import br.com.gerencia_projetos.dto.ProjetoResponseDTO;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<ProjetoResponseDTO> createProjeto(@RequestBody ProjetoRequestDTO dto) {
        ProjetoResponseDTO projeto_criado = projetoService.createProjeto(dto);
        return new ResponseEntity<>(projeto_criado, HttpStatus.CREATED);
    }
    
    @GetMapping
    public List<ProjetoResponseDTO> listProjeto() {
        return projetoService.listAllProjeto();
    }
}
