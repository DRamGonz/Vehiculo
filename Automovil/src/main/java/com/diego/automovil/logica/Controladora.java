package com.diego.automovil.logica;

import com.diego.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {

        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);

        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {

        return controlPersis.traerAutos();

    }

    public void borrarAuto(int IdAuto) {

        controlPersis.borrarAuto(IdAuto);

    }

    public Automovil traerAuto(int idAuto) {

        return controlPersis.traerAutos(idAuto);

    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {

        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setCantPuertas(cantPuertas);

        //le pido a la persistencia que la modifique
        controlPersis.modificarAuto(auto);

    }

}
