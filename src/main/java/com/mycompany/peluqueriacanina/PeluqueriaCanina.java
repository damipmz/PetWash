package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.IGU.Principal;


public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        //Visibilidad y posicion pantalla principal
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null); //Lo mismo que event pero en la logica.
        
        
    }
}
