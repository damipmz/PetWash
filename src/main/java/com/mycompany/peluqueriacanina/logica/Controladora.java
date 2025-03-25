package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    //Logica llama a la persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atEspecial, String nombreDuenio, String celDuenio) {
        
        //Creo las instancias (objetos) y asigno valores
        //Dueño
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        
        //Mascota
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atEspecial);
        masco.setObservaciones(observaciones);
        masco.setDuenio(duenio); //Me lo asocia automaticamente
        
        
        //Le mando los datos a persistencia para que guarde los datos en BD
        controlPersis.guardar(duenio,masco);
        
    }

    public List<Mascota> traerMascotas() {  
        return controlPersis.traerMascotas(); //Pido a la persistencia que me traiga las mascotas
    };

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }
    
    
}
