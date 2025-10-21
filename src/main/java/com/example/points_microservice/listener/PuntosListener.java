package com.example.points_microservice.listener;

import com.example.points_microservice.event.ClienteCreadoEvent;
import com.example.points_microservice.service.PuntosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PuntosListener {

    private final PuntosService puntosService;

    @RabbitListener(queues = "puntos.queue")
    public void onClienteCreado(ClienteCreadoEvent event) {
        System.out.println("Recibido evento en puntos-service para cliente " + event.getId());
        puntosService.crearRegistroPuntos(event.getId());
    }
}
