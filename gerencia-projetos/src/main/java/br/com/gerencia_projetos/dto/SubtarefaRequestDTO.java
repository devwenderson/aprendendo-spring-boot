package br.com.gerencia_projetos.dto;

import java.time.LocalDate;

public class SubtarefaRequestDTO {
    private Long id; 
    private LocalDate finalizado_em;
    private LocalDate finalizar_em;
    private LocalDate iniciado_em;
    private Long id_projeto;
    private String descricao;
    private Integer codigo_status;

    public SubtarefaRequestDTO() {}

    public SubtarefaRequestDTO(Long id, LocalDate finalizado_em, LocalDate finalizar_em, LocalDate iniciado_em,
            Long id_projeto, String descricao, Integer codigo_status) {
        this.id = id;
        this.finalizado_em = finalizado_em;
        this.finalizar_em = finalizar_em;
        this.iniciado_em = iniciado_em;
        this.id_projeto = id_projeto;
        this.descricao = descricao;
        this.codigo_status = codigo_status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getIniciado_em() {
        return iniciado_em;
    }

    public void setIniciado_em(LocalDate iniciado_em) {
        this.iniciado_em = iniciado_em;
    }

    public Long getId_projeto() {
        return id_projeto;
    }

    public void setId_projeto(Long id_projeto) {
        this.id_projeto = id_projeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigoStatus() {
        return codigo_status;
    }

    public void setCodigoStatus(Integer codigo_status) {
        this.codigo_status = codigo_status;
    }
}
