package edu.elsmancs.Bici_palma.domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TarjetaUsuarioTest {


    @Test
    public void crearTarjetaUsuarioTest() {
        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("123456789", true);
        assertEquals(tarjetaUsuario.getId(), "123456789");
        assertEquals(tarjetaUsuario.getActivada(), true);
    }

    @Test
    public void casoTarjetaUsuarioLenghtmayor9() {
        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("1123456789", false);
        assertEquals(tarjetaUsuario.getTamañoId(), false);
    }

    @Test
    public void casoTarjetaUsuarioLenghtCorrecta() {
        TarjetaUsuario tarjetaUsuario = new TarjetaUsuario("112345678", true);
        assertEquals(tarjetaUsuario.getTamañoId(), true);
    }
}
