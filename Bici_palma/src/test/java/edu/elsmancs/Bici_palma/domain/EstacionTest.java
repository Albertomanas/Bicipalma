package edu.elsmancs.Bici_palma.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class EstacionTest {

    @Test
    public void crearEstacionTest(){
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(estacion.getNumEstacion(), 1, 0);
        assertEquals(estacion.getDireccion(), "Manacor");
        assertEquals(estacion.getNumeroAnclajes(), 6);
}

    @Test
    public void consultarEstacionTest1() {
        Estacion consultarEstacion = new Estacion(2, "Marratxi", 6);
        assertEquals(consultarEstacion.getNumEstacion(), 2,0);
}

    @Test
    public void consultarAnclajesLibresTest() {
        Estacion estacion = new Estacion(4, "Coll", 6);
        assertEquals(estacion.anclajesLibres(), 6, 0);
    }


    @Test
    public void anclarBicicletaTest() {
        Estacion estacion = new Estacion( 1, "Soller", 6);
        int[] bicicletas = {291, 292, 293, 294}; //Misma array que BiciPalma.
        Bicicleta[] anclajes; //Array tipo Bicicleta llamada anclajes.
        int posicionAnclaje = 0; //variable para controlar la comparativa de la Array.
        anclajes = new Bicicleta[6]; //Limitamos a 6 el número de anclajes posibles.
        for (int id : bicicletas) {
            Bicicleta bicicleta = new Bicicleta(id);
            estacion.anclarBicicleta(bicicleta);
            anclajes[posicionAnclaje] = bicicleta;
            posicionAnclaje++;
        }
        assertArrayEquals(anclajes, estacion.getAnclajes());; // comparar las arrays
    }


    /*@Test
    public void consultarAnclajesTest() {}
      */  // No es necesario dado a que cada parametro está testeado


}