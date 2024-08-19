package com.todocode.clientelapelucanina.persistencia;

import com.todocode.clientelapelucanina.logica.Duenio;
import com.todocode.clientelapelucanina.logica.Mascota;

public class ControladoraPersistencia {
   
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascoJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        duenioJpa.create(duenio);
        mascoJpa.create(masco);
        
    }
    
}
