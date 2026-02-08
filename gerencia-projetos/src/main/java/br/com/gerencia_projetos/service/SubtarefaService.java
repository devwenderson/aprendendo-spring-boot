package br.com.gerencia_projetos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerencia_projetos.domain.Projeto;
import br.com.gerencia_projetos.domain.Subtarefa;
import br.com.gerencia_projetos.domain.Status;

import br.com.gerencia_projetos.dto.SubtarefaRequestDTO;
import br.com.gerencia_projetos.repository.SubtarefaRepository;

@Service
public class SubtarefaService {

    @Autowired
    private ProjetoService projetoService; 

    @Autowired
    private SubtarefaRepository subtarefaRepository;

    public Subtarefa createSubtarefa(SubtarefaRequestDTO dto) {
        Projeto projeto = projetoService.getProjetoById(dto.getId_projeto());

        Status status = Status.fromCode(dto.getCodigoStatus());

        Subtarefa subtarefa = new Subtarefa(null, dto.getFinalizado_em(), dto.getFinalizar_em(), 
                                dto.getIniciado_em(), projeto, dto.getDescricao(), status);
        Subtarefa subtarefa_criada = subtarefaRepository.save(subtarefa);
        return subtarefa_criada;
    }

    public List<Subtarefa> listAllSubtarefas() {
        return subtarefaRepository.findAll();
    }

    // public Projeto getProjetoById(Long id) {
    //     Optional<Projeto> projeto = projetoRepository.findById(id);
    //     return projeto.orElseThrow(() -> new RuntimeException(
    //         "Projeto não encontrado. ID: " + id
    //     ));
    // }

    // public Projeto updateProjeto(Long id, Projeto detalhesProjeto) {
    //     Projeto projeto = getProjetoById(id);
    //     projeto.setUsuario(detalhesProjeto.getUsuario());
    //     projeto.setDescricao(detalhesProjeto.getDescricao());
    //     projeto.setFinalizado_em(detalhesProjeto.getFinalizado_em());
    //     projeto.setFinalizar_em(detalhesProjeto.getFinalizar_em());
    //     projeto.setInicado_em(detalhesProjeto.getInicado_em());
    //     projeto.setValor(detalhesProjeto.getValor());
    //     return projetoRepository.save(projeto);
    // }

    // public void deleteProjeto(Long id) {
    //     Projeto projeto = getProjetoById(id);
    //     projetoRepository.delete(projeto);
    // }

}
