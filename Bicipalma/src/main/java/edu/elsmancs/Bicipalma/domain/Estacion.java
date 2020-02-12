package edu.elsmancs.Bicipalma.domain;

public class Estacion {

    private int id = 0;
    private String direccion = null; //Inicializamos con null por conveniencia del programa
    private int numeroAnclajes = 0;
    private final Bicicleta[] anclajes = null; //Array de Bicicletas


    public Estacion(int id, String direccion, int anclajes){ //Método constructor

        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[numeroAnclajes];
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

