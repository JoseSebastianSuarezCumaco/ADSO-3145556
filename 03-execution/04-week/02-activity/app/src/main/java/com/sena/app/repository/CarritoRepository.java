package com.sena.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.app.entity.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Integer> {

}