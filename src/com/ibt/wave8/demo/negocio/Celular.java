package com.ibt.wave8.demo.negocio;

public class Celular implements  Precedable<Celular>{


    private String numero;
    private Persona titular;

    public Celular() {
    }

    public Celular(String numero, Persona titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "El numero de celular es: " + numero + "\nA " + titular;
    }

    @Override
    public int precedeA(Celular celular) {
        return this.titular.precedeA(celular.getTitular());
        //return numero.compareTo(celular.getNumero());
    }
}
