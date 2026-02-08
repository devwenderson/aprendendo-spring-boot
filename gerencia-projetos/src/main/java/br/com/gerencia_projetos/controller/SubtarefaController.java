package br.com.gerencia_projetos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gerencia_projetos.domain.Subtarefa;
import br.com.gerencia_projetos.service.SubtarefaService;
import br.com.gerencia_projetos.dto.SubtarefaRequestDTO;

@RestController
@RequestMapping("/api/subtarefas")
public class SubtarefaController {
    @Autowired
    private SubtarefaService subtarefaService;

    @PostMapping
    public ResponseEntity<Subtarefa> createProjeto(@Validated @RequestBody SubtarefaRequestDTO dto) {
        Subtarefa subtarefa_criada = subtarefaService.createSubtarefa(dto);
        return new ResponseEntity<>(subtarefa_criada, HttpStatus.CREATED);
    }
    
    @GetMapping
    public List<Subtarefa> listSubtarefas() {
        return subtarefaService.listAllSubtarefas();
    }
}
