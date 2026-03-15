package com.example.Ex2.Repositories;

import com.example.Ex2.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;

public interface RepositorioProduto extends JpaRepository<Produto, Long> {
}
