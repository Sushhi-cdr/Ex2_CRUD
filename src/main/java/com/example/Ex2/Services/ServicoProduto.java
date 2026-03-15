package com.example.Ex2.Services;

import com.example.Ex2.Entity.Produto;
import com.example.Ex2.Repositories.RepositorioProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoProduto {

    @Autowired
    private RepositorioProduto repositorio;

    public Produto criar(Produto produto){
        return repositorio.save(produto);
    }

    public List<Produto> listar(){
        return repositorio.findAll();
    }

    public Produto buscarPorId(Long id){
        return repositorio.findById(id).orElse(null);
    }

    public void remover(Long id){
        repositorio.deleteById(id);
    }
}
