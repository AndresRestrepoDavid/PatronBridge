package com.example.conBridge.implementacion;

public class Hospital implements ImplementacionServicioSalud {
    @Override
    public void atenderPaciente() {
        System.out.println("Atendiendo paciente en el hospital");
    }
}
