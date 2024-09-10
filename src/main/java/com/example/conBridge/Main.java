package com.example.conBridge;

import com.example.conBridge.abstraccion.ServicioClinica;
import com.example.conBridge.abstraccion.ServicioHospital;
import com.example.conBridge.abstraccion.ServicioSalud;
import com.example.conBridge.implementacion.Clinica;
import com.example.conBridge.implementacion.Hospital;

public class Main {
    public static void main(String[] args) {
        ServicioSalud servicioHospital = new ServicioHospital();
        servicioHospital.setImplementacion(new Hospital());
        servicioHospital.atenderPaciente();

        ServicioSalud servicioClinica = new ServicioClinica();
        servicioClinica.setImplementacion(new Clinica());
        servicioClinica.atenderPaciente();
    }
}