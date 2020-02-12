package edu.elsmancs.Bici_palma.domain;

public class Bicicleta {
    private int id = 0; //limitado a 3 dígitos.

    public Bicicleta(int id) { // Método constructor.
         this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
