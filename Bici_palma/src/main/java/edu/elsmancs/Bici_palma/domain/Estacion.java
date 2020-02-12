package edu.elsmancs.Bici_palma.domain;

//import bicicleta.Bicicleta;
//import tarjetaUsuario.TarjetaUsuario;

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

    public int anclajesLibre() { //Tiene que devolver int porque buscamos un numérico.
        int anclajesLibres = 0;
        for (Bicicleta anclaje : this.anclajes) ;
            if (anclaje == null) { //Así en el caso de que no haya ninguna Bicicleta estará en null.
                anclajesLibres++;
            } else ;
        }
        return anclajesLibres;
}

        public void anclarBicicleta(Bicicleta bicicleta) {
            int posicion = 0;
            int numeroAnclaje = posicion + 1;

            for (Bicicleta anclaje: this.anclajes) {
                if (anclaje == null) {
                    this.anclajes[posicion] = bicicleta;
                    mostrarAnclaje()
                }
            }
        }

}