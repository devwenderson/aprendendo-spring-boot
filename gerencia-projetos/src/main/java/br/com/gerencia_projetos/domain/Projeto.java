package br.com.gerencia_projetos.domain;

import java.math.BigDecimal;
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
@Table(name = "TB_PROJETOS")
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_id", nullable = false)
    private Long id;

    @Column(name = "pro_iniciado_em", nullable = false)
    private LocalDate iniciado_em;
    
    @Column(name = "pro_finalizado_em", nullable = true)
    private LocalDate finalizado_em;
    
    @Column(name = "pro_finalizar_em", nullable = true)
    private LocalDate finalizar_em;
    
    @Column(name = "pro_valor", nullable = true)
    private BigDecimal valor;

    @Column(name = "pro_descricao", nullable = true)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "pro_usu_id", nullable = false)
    private Usuario usuario;

    Projeto() {}

    public Projeto( Long id, 
                    LocalDate iniciado_em, 
                    LocalDate finalizado_em, 
                    LocalDate finalizar_em, 
                    BigDecimal valor,
                    String descricao, 
                    Usuario usuario ) {
        this.id = id;
        this.iniciado_em = iniciado_em;
        this.finalizado_em = finalizado_em;
        this.finalizar_em = finalizar_em;
        this.valor = valor;
        this.descricao = descricao;
        this.usuario = usuario;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getIniciado_em() {
        return iniciado_em;
    }
    public void setIniciado_em(LocalDate iniciado_em) {
        this.iniciado_em = iniciado_em;
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

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
