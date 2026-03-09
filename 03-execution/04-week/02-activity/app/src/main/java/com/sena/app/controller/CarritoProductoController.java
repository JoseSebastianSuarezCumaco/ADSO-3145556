package com.sena.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.app.entity.CarritoProducto;
import com.sena.app.repository.CarritoProductoRepository;

@RestController
@RequestMapping("/carrito-productos")
public class CarritoProductoController {

    private final CarritoProductoRepository carritoProductoRepository;

    public CarritoProductoController(CarritoProductoRepository carritoProductoRepository) {
        this.carritoProductoRepository = carritoProductoRepository;
    }

    @GetMapping
    public List<CarritoProducto> obtenerCarritoProductos() {
        return carritoProductoRepository.findAll();
    }

    @PostMapping
    public CarritoProducto crearCarritoProducto(@RequestBody CarritoProducto carritoProducto) {
        return carritoProductoRepository.save(carritoProducto);
    }
}