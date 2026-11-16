package br.com.ajudaaqui.model.repository;

import br.com.ajudaaqui.model.entity.Rota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RotaRepository extends JpaRepository<Rota, Long> {
    Rota findByCodigo(Long codigo);
}
