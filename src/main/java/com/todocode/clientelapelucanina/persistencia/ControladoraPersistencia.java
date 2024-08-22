package com.todocode.clientelapelucanina.persistencia;

import com.todocode.clientelapelucanina.logica.Duenio;
import com.todocode.clientelapelucanina.logica.Mascota;
import com.todocode.clientelapelucanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
   
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        duenioJpa.create(duenio);
        mascoJpa.create(masco);
        
    }

    public List<Mascota> traerMascotas() {

        return mascoJpa.findMascotaEntities();
        
    }

    public void borrarMascota(int num_cliente) {

        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Mascota traerMascota(int num_cliente) {

        return mascoJpa.findMascota(num_cliente);

    }

    public void modificarMascota(Mascota masco) {
    
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Duenio traerDuenio(int id_duenio) {

        return duenioJpa.findDuenio(id_duenio);
        
    }

    public void modificarDuenio(Duenio duenio) {

        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
