package br.com.gerencia_financas.repository;
import br.com.gerencia_financas.domain.Carteira;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteiraRepository extends JpaRepository<Carteira, Long> {
    
}
