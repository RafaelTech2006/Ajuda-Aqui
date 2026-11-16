package br.com.ajudaaqui.model.repository;

import br.com.ajudaaqui.model.entity.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long>{
    Ocorrencia findByCodigo(Long codigo);
}
