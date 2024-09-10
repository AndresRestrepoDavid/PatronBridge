package com.example.conBridge.abstraccion;

import com.example.conBridge.implementacion.ImplementacionServicioSalud;

/*Aquí vemos como estamos trabajando de la mano de la
* Logica de alto nivel, en donde nos despreocupamos de detalles,
* aquí sabemos que los diferentes servicios de salud tienen dos
* Metodos generales que seran implementados por clases concretas o
* las abstracciones refinadas*/
public interface ServicioSalud {
    void setImplementacion(ImplementacionServicioSalud implementacion);
    void atenderPaciente();
}

