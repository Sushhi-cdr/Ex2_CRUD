package com.example.Ex2.Controllers;

import com.example.Ex2.Entity.Produto;
import com.example.Ex2.Services.ServicoProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Produtos")
public class ControleProduto {

    @Autowired
    private ServicoProduto servico;

    @PostMapping
    public Produto criar(@RequestBody Produto produto){
        return servico.criar(produto);
    }

    @GetMapping
    public List<Produto> listar(){
        return servico.listar();
    }

    @GetMapping("/{id}")
    public Produto buscar(@PathVariable Long id){
        return servico.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        servico.remover(id);
    }
}
