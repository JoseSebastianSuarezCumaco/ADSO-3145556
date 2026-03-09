package com.sena.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.app.entity.Carrito;
import com.sena.app.repository.CarritoRepository;

@RestController
@RequestMapping("/carritos")
public class CarritoController {

    private final CarritoRepository carritoRepository;

    public CarritoController(CarritoRepository carritoRepository) {
        this.carritoRepository = carritoRepository;
    }

    @GetMapping
    public List<Carrito> obtenerCarritos() {
        return carritoRepository.findAll();
    }

    @PostMapping
    public Carrito crearCarrito(@RequestBody Carrito carrito) {
        return carritoRepository.save(carrito);
    }
}
