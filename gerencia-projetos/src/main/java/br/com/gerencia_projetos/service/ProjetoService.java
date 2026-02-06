package br.com.gerencia_projetos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerencia_projetos.domain.Projeto;
import br.com.gerencia_projetos.repository.ProjetoRepository;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository; 

    public Projeto createProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public List<Projeto> listAllProjeto() {
        return projetoRepository.findAll();
    }

    public Projeto getProjetoById(Long id) {
        Optional<Projeto> projeto = projetoRepository.findById(id);
        return projeto.orElseThrow(() -> new RuntimeException(
            "Projeto não encontrado. ID: " + id
        ));
    }

    public Projeto updateProjeto(Long id, Projeto detalhesProjeto) {
        Projeto projeto = getProjetoById(id);
        projeto.setUsuario(detalhesProjeto.getUsuario());
        projeto.setDescricao(detalhesProjeto.getDescricao());
        projeto.setFinalizado_em(detalhesProjeto.getFinalizado_em());
        projeto.setFinalizar_em(detalhesProjeto.getFinalizar_em());
        projeto.setInicado_em(detalhesProjeto.getInicado_em());
        projeto.setValor(detalhesProjeto.getValor());
        return projetoRepository.save(projeto);
    }

    public void deleteProjeto(Long id) {
        Projeto projeto = getProjetoById(id);
        projetoRepository.delete(projeto);
    }

}
