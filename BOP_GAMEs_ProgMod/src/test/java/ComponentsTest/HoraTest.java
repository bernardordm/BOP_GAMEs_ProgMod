package ComponentsTest;

import Components.Hora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HoraTest {

    @Test
    public void testValidarHora() {
        assertTrue(Hora.validarHora(12, 30, 45));
        assertFalse(Hora.validarHora(25, 30, 45));
        assertFalse(Hora.validarHora(12, 60, 45));
        assertFalse(Hora.validarHora(12, 30, 60));
    }

    @Test
    public void testAjustarHora() {
        Hora hora = new Hora(10, 20, 30);
        hora.ajustarHora(15, 45, 50);
        assertEquals(15, hora.getHora());
        assertEquals(45, hora.getMinuto());
        assertEquals(50, hora.getSegundo());
    }

    @Test
    public void testIncrementar() {
        Hora hora = new Hora(10, 59, 50);
        hora.incrementar(15);
        assertEquals(11, hora.getHora());
        assertEquals(0, hora.getMinuto());
        assertEquals(5, hora.getSegundo());
    }

    @Test
    public void testEstaNaFrenteDe() {
        Hora hora1 = new Hora(10, 20, 30);
        Hora hora2 = new Hora(9, 20, 30);
        assertTrue(hora1.EstahNaFrenteDe(hora2));
        assertFalse(hora2.EstahNaFrenteDe(hora1));
    }

    @Test
    public void testHoraFormatada() {
        Hora hora = new Hora(5, 7, 9);
        assertEquals("05:07:09", hora.HoraFormatada());
    }
}