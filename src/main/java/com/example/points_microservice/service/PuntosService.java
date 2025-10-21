package com.example.points_microservice.service;

import com.example.points_microservice.model.Puntos;
import com.example.points_microservice.repository.PuntosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PuntosService {

    @Autowired
    private PuntosRepository puntosRepository;

    public void crearRegistroPuntos(Long userId, String email) {
        Puntos puntos = new Puntos();
        puntos.setUserId(userId);
        puntos.setPoints(0);
        puntos.setEmail(email);
        puntosRepository.save(puntos);
        System.out.println("Registro de puntos creado para cliente " + userId);
    }
}
