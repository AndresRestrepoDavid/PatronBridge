package com.example.conBridge.abstraccion;

import com.example.conBridge.implementacion.ImplementacionServicioSalud;

public class ServicioClinica implements ServicioSalud {
    private ImplementacionServicioSalud implementacion;

    @Override
    public void setImplementacion(ImplementacionServicioSalud implementacion) {
        this.implementacion = implementacion;
    }

    @Override
    public void atenderPaciente() {
        implementacion.atenderPaciente();
    }
}
