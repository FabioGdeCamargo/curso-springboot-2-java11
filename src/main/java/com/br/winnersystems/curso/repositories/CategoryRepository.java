package com.br.winnersystems.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.winnersystems.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
