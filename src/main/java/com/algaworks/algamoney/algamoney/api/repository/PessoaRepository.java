package com.algaworks.algamoney.algamoney.api.repository;

import com.algaworks.algamoney.algamoney.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
