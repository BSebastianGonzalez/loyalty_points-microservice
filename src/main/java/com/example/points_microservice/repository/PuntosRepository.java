package com.example.points_microservice.repository;

import com.example.points_microservice.model.Puntos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PuntosRepository extends JpaRepository<Puntos, Long> {
    Optional<Puntos> findByEmail(String email);
}
