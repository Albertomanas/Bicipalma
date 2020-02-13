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
    public Bicicleta[] getAnclajes() {
        return this.anclajes;
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

    public void anclarBicicleta(Bicicleta bicicleta) {
        int posicion = 0;
        int numeroAnclaje = posicion + 1;

        for (Bicicleta anclaje: this.anclajes) {
            if (anclaje == null) {
                this.anclajes[posicion] = bicicleta;
                //En caso de estar vació, se asignará la bicicleta entrante.
                mostrarAnclaje(bicicleta, numeroAnclaje); //SETTER que se hará posteriormente
                break;

                /*Imprescindible, sino no se asignarán las siguientes bicicletas
                 * en las posiciones correlativas
                 */
            }
            else
                posicion++;
                numeroAnclaje++;
        }
    }

    public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclajes) {
        System.out.println("bicicleta: " + bicicleta.getId() + " anclada en el anclaje: " + getNumeroAnclajes());
        //numeroAnclaje es un contador que se hará en consultarAnclajes
    }

//Comprueba que la tarjeta está activa
    public boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario) {
        return tarjetaUsuario.getActivada();
    }

    public void consultarAnclajes() {
        int posicion = 0;
        int numeroAnclaje = 0;

        for (Bicicleta bicicleta : this.anclajes) {
            numeroAnclaje = posicion + 1;
            if (bicicleta != null) {
                System.out.println("Anclaje " + numeroAnclaje + "" + this.anclajes[posicion].getId());
            }
            else {
                System.out.println("Anclaje " + numeroAnclaje + "" + " libre");

                posicion++;
            }
        }
    }

}