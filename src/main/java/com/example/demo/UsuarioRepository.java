package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Não precisa escrever nada aqui. O JpaRepository já tem os métodos .save(), .findAll(), etc.
}