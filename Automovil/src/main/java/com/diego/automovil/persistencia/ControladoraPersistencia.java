package com.diego.automovil.persistencia;

import com.diego.automovil.logica.Automovil;
import com.diego.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {

        autoJpa.create(auto);

    }

    public List<Automovil> traerAutos() {

        return autoJpa.findAutomovilEntities();

    }

    public void borrarAuto(int IdAuto) {

        try {
            //Distroy es para borrar
            autoJpa.destroy(IdAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Automovil traerAutos(int idAuto) {
        return autoJpa.findAutomovil(idAuto);

    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
