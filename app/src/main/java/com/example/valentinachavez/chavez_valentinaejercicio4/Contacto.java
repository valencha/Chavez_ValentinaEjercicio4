package com.example.valentinachavez.chavez_valentinaejercicio4;

public class Contacto {

    private String nombre;
    private String numero;
    private String genero;


    public Contacto(String nombre,String numero,String genero){

        this.nombre=nombre;
        this.numero=numero;
        this.genero=genero;

    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
