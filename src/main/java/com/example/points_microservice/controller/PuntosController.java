package com.example.points_microservice.controller;

import com.example.points_microservice.model.Puntos;
import com.example.points_microservice.repository.PuntosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/puntos")
@RequiredArgsConstructor
public class PuntosController {

    private final PuntosRepository puntosRepository;

    @GetMapping("/{email}")
    public Puntos getPuntosByEmail(@PathVariable String email) {
        Optional<Puntos> puntosOpt = puntosRepository.findByEmail(email);
        return puntosOpt.orElseThrow(() -> new RuntimeException("No se encontraron puntos para este cliente"));
    }

}
