package br.com.gerencia_projetos.domain;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_SUBTAREFAS")
public class Subtarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sbt_id", nullable = false)
    private Long Id;

    @Column(name = "sbt_finalizado_em", nullable = true)
    private LocalDate finalizado_em;

    @Column(name = "sbt_finalizar_em", nullable = true)
    private LocalDate finalizar_em;

    @Column(name = "sbt_iniciado_em", nullable = false)
    private LocalDate iniciado_em;

    @ManyToOne
    @JoinColumn(name = "sbt_pro_id", nullable = false)
    private Projeto projeto;

    @Column(name = "sbt_descricao", nullable = true)
    private String descricao;

    @Column(name = "sbt_status", nullable = false)
    private Status status;

    public Subtarefa() {}

    public Subtarefa(Long id, LocalDate finalizado_em, LocalDate finalizar_em, LocalDate iniciado_em, Projeto projeto,
            String descricao, Status status) {
        Id = id;
        this.finalizado_em = finalizado_em;
        this.finalizar_em = finalizar_em;
        this.iniciado_em = iniciado_em;
        this.projeto = projeto;
        this.descricao = descricao;
        this.status = status;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
}
