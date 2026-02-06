package br.com.gerencia_projetos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerencia_projetos.domain.Usuario;
import br.com.gerencia_projetos.dto.UsuarioDTO;
import br.com.gerencia_projetos.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    // Criar novo usuário
    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Listar todos os usuarios
    public List<UsuarioDTO> listAllUsuarios() {
        return usuarioRepository.findAll()
            .stream()
            .map(UsuarioDTO::new)
            .toList();
    }

    // Buscar usuário
    public Usuario getUsuarioById(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElseThrow(() -> new RuntimeException(
            "Usuário não encontrado! ID: " + id
        ));
    }

    public UsuarioDTO getUsuarioDTOById(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException(
            "Usuário não encontrado! ID: " + id
        ));
        UsuarioDTO usuarioDto = new UsuarioDTO(usuario);
        return usuarioDto;
    }

    // Atualizar usuário
    public Usuario updateUsuario(Long id, Usuario detalhesUsuario) {
        Usuario usuario = getUsuarioById(id);
        usuario.setNome(detalhesUsuario.getNome());
        usuario.setEmail(detalhesUsuario.getEmail());
        usuario.setSenha(detalhesUsuario.getSenha());
        return usuarioRepository.save(usuario);
    }

    // Excluir usuário
    public void deleteUsuario(Long id) {
        Usuario usuario = getUsuarioById(id);
        usuarioRepository.delete(usuario);
    }
}
