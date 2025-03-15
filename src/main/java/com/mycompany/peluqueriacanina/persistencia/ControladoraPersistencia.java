package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        //Uso los metodos del jpa controller.
        //Primero creo el dueño en la BD, y despues la mascota, asi la mascota la asocio al dueño
        duenioJpa.create(duenio);
        
        //Creo la mascota en la BD
        mascotaJpa.create(masco);
        
    }

    public List<Mascota> traerMascotas() {
        return mascotaJpa.findMascotaEntities(); //Busca los registros de la tabla mascota
    };
    
    
}
