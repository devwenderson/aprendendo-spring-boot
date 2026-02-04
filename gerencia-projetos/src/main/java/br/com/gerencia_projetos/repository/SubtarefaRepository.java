package br.com.gerencia_projetos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gerencia_projetos.domain.Subtarefa;

@Repository
public interface SubtarefaRepository extends JpaRepository<Subtarefa, Long> {
    
}
