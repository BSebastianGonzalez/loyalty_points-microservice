package com.example.points_microservice.repository;

import com.example.points_microservice.model.Puntos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuntosRepository extends JpaRepository<Puntos, Long> {
}
