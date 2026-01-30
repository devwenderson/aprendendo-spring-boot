package br.com.gerencia_financas.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private Long idCompromisso;

    @Column(nullable = false)
    private Long idCarteira;

    @Column(nullable = false)
    private LocalDateTime realizadoEm; 

    public Movimento() {

    }

    public Movimento(Long id, Long idCompromisso, Long idCarteira, LocalDateTime realizadoEm) {
        this.id = id;
        this.idCompromisso = idCompromisso;
        this.idCarteira = idCarteira;
        this.realizadoEm = realizadoEm;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdCompromisso(Long idCompromisso) {
        this.idCompromisso = idCompromisso;
    }

    public void setIdCarteira(Long idCarteira) {
        this.idCarteira = idCarteira;
    }
    
    public void setRealizadoEm(LocalDateTime realizadoEm) {
        this.realizadoEm = realizadoEm;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public Long getIdCompromisso() {
        return this.idCompromisso;
    }

    public Long getIdCarteira() {
        return this.idCarteira;
    }
    
    public LocalDateTime getRealizadoEm() {
        return this.realizadoEm;
    }
    
    
}
