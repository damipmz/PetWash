package com.mycompany.peluqueriacanina.logica;


public class Duenio {

    private int id;
    private String nombre;
    private String celDuenio;

    
    //Constructores.
    public Duenio() {
    }

    public Duenio(int id, String nombre, String celDuenio) {
        this.id = id;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    //Getters y Setters.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    
    
}


