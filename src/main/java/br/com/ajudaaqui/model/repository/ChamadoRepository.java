package br.com.ajudaaqui.model.repository;

import br.com.ajudaaqui.model.entity.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {
    Chamado findByCodigo(Long codigo);
}
