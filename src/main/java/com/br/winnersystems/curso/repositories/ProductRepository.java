package com.br.winnersystems.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.winnersystems.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
