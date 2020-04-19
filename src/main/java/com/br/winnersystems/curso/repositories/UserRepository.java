package com.br.winnersystems.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.winnersystems.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
