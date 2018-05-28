package com.algaworks.algamoney.algamoney.api.repository;

import com.algaworks.algamoney.algamoney.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}