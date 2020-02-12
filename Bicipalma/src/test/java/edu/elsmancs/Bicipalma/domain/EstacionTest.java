package edu.elsmancs.Bicipalma.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class EstacionTest {

    @Test
    public void crearEstacionTest(){
        Estacion estacion = new Estacion(1, "Manacor", 6);
        assertEquals(estacion.getNumEstacion(), 1, 0);
        assertEquals(estacion.getDireccion(), "Manacor", 0);
        assertEquals(estacion.getNumeroAnclajes(), 6);
    }

}