package edu.elsmancs.Bicipalma.domain;

public class Estacion {

    private int id = 0;
    private String direccion = "";
    private int numeroAnclajes = 0;
    private final Object[] anclajes = null;


    public Estacion(int id, String direccion, int numeroAnclajes){ //Método constructor

        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Object[anclajes];
    }

    public int getNumEstacion() {
        return this.id;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getNumeroAnclajes() {
        return this.numeroAnclajes;
    }



}

