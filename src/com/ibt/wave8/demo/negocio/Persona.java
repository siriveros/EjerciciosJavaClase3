package com.ibt.wave8.demo.negocio;

import java.util.Locale;

public class Persona implements  Precedable<Persona>{

    private String nombre;
    private int dni;

    public Persona() {

    }

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre de la persona " + nombre + "\nNumero de Identificacion " + dni;
    }

    @Override
    public int precedeA(Persona persona) {
        //return dni - persona.dni;
        return this.nombre.toLowerCase().compareTo(persona.getNombre().toLowerCase());
    }
}
