package br.com.gerencia_projetos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.gerencia_projetos.domain.Projeto;

public class ProjetoResponseDTO {
    private Long id; 
    private LocalDate inicado_em; 
    private LocalDate finalizado_em; 
    private LocalDate finalizar_em; 
    private BigDecimal valor;
    private String descricao; 
    private UsuarioDTO usuario;

    public ProjetoResponseDTO() {}

    public ProjetoResponseDTO(Projeto projeto) {
        this.id = projeto.getId();
        this.inicado_em = projeto.getInicado_em();
        this.finalizado_em = projeto.getFinalizado_em();
        this.finalizar_em = projeto.getFinalizar_em();
        this.valor = projeto.getValor();
        this.descricao = projeto.getDescricao();
        this.usuario = new UsuarioDTO(projeto.getUsuario());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInicado_em() {
        return inicado_em;
    }

    public void setInicado_em(LocalDate inicado_em) {
        this.inicado_em = inicado_em;
    }

    public LocalDate getFinalizado_em() {
        return finalizado_em;
    }

    public void setFinalizado_em(LocalDate finalizado_em) {
        this.finalizado_em = finalizado_em;
    }

    public LocalDate getFinalizar_em() {
        return finalizar_em;
    }

    public void setFinalizar_em(LocalDate finalizar_em) {
        this.finalizar_em = finalizar_em;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    
}
