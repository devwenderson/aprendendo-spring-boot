package br.com.gerencia_projetos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProjetoRequestDTO {
    private Long id; 
    private LocalDate inicado_em; 
    private LocalDate finalizado_em; 
    private LocalDate finalizar_em; 
    private BigDecimal valor;
    private String descricao; 
    private Long id_usuario;
}
