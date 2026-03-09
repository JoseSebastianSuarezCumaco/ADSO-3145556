package com.sena.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.app.entity.Pago;
import com.sena.app.repository.PagoRepository;

@RestController
@RequestMapping("/pagos")
public class PagoController {

    private final PagoRepository pagoRepository;

    public PagoController(PagoRepository pagoRepository) {
        this.pagoRepository = pagoRepository;
    }

    @GetMapping
    public List<Pago> obtenerPagos() {
        return pagoRepository.findAll();
    }

    @PostMapping
    public Pago crearPago(@RequestBody Pago pago) {
        return pagoRepository.save(pago);
    }
}