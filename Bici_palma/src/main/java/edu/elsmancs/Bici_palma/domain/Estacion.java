package edu.elsmancs.Bici_palma.domain;


public class Estacion {

    private int id = 0;
    private String direccion = null; //Inicializamos con null por conveniencia del programa
    private int numeroAnclajes = 0;
    private Bicicleta[] anclajes = null; //Array de Bicicletas


    public Estacion(int id, String direccion, int numeroAnclajes) { //Método constructor

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

    public void consultarEstacion() { //Seguir la estructura de la salida que recibimos
        System.out.println("id: " + getNumEstacion());
        System.out.println("direccion: " + getDireccion());
        System.out.println("numeroAnclajes: " + getNumeroAnclajes());
    }

    public int anclajesLibres() {  //Tiene que devolver int porque buscamos un numérico.
       int valor = 0;
       for (Bicicleta anclaje: this.anclajes) {
           if (anclaje == null) { //Si es null dicho anclaje está libre.
               valor++;
           }
       }
       return valor;
    }
}