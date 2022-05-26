package com.guvia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guvia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
