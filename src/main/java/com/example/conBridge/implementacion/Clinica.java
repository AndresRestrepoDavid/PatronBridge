package com.example.conBridge.implementacion;

public class Clinica implements ImplementacionServicioSalud {
    @Override
    public void atenderPaciente() {
        System.out.println("Atendiendo paciente en la clínica");
    }
}
