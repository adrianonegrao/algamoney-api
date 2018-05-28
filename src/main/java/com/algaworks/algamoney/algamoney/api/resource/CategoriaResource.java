package com.algaworks.algamoney.algamoney.api.resource;

import com.algaworks.algamoney.algamoney.api.model.Categoria;
import com.algaworks.algamoney.algamoney.api.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listar(){
        return categoriaRepository.findAll();
    }

}
