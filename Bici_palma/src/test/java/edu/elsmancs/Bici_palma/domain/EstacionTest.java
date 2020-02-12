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
    public void
}