package br.com.isthefani.ordemdesevico.departamento.repositories;

import br.com.isthefani.ordemdesevico.departamento.domain.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
}
