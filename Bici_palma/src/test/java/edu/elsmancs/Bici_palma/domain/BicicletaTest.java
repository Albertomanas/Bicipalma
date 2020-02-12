package edu.elsmancs.Bici_palma.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class BicicletaTest {

    @Test
    public void comprobarIdBicicletaTest() {
        Bicicleta bicicleta = new Bicicleta(234);
        assertEquals(234, 234);
    }
}
