package br.com.gerencia_projetos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerencia_projetos.domain.Projeto;
import br.com.gerencia_projetos.dto.ProjetoRequestDTO;
import br.com.gerencia_projetos.dto.ProjetoResponseDTO;
import br.com.gerencia_projetos.repository.ProjetoRepository;
import br.com.gerencia_projetos.domain.Usuario;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository; 

    @Autowired
    private UsuarioService usuarioService;

    public ProjetoResponseDTO createProjeto(ProjetoRequestDTO dto) {
        Usuario usuario = usuarioService.getUsuarioById(dto.getId_usuario());
        Projeto projeto = new Projeto(null, dto.getInicado_em(), 
        dto.getFinalizado_em(), dto.getFinalizar_em(), dto.getValor(), dto.getDescricao(), usuario);
        Projeto projeto_criado = projetoRepository.save(projeto);
        return new ProjetoResponseDTO(projeto_criado);
    }

    public List<ProjetoResponseDTO> listAllProjeto() {
        return projetoRepository.findAll()
            .stream()
            .map((pro) -> new ProjetoResponseDTO(pro))
            .toList();
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
