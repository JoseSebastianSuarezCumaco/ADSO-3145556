package com.sena.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.app.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}