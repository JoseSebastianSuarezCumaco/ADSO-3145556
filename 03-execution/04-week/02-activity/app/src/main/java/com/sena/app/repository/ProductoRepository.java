package com.sena.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.app.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}