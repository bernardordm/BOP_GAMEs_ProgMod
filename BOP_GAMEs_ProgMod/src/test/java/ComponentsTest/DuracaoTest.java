package ComponentsTest;

import Components.Duracao;
import Components.Hora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuracaoTest {

    @Test
    public void TesteConstrutor() {
        Hora horaInicial = new Hora(9, 0, 0);
        Duracao duracao = new Duracao(horaInicial, 4500);
        assertEquals(horaInicial, duracao.getHoraInicial());
        assertEquals(4500, duracao.getDuracaoTotal());
    }

    @Test
    public void TesteSetHoraInicial() {
        Hora horaInicial = new Hora(7, 45, 0);
        Duracao duracao = new Duracao(horaInicial, 3000);
        Hora novaHoraInicial = new Hora(10, 15, 0);
        duracao.setHoraInicial(novaHoraInicial);
        assertEquals(novaHoraInicial, duracao.getHoraInicial());
    }

    @Test
    public void TesteSetDuracaoTotal() {
        Hora horaInicial = new Hora(6, 30, 0);
        Duracao duracao = new Duracao(horaInicial, 5000);
        duracao.setDuracaoTotal(8000);
        assertEquals(8000, duracao.getDuracaoTotal());
    }

    @Test
    public void TesteMaiorQue() {
        Hora horaInicial = new Hora(5, 0, 0);
        Duracao duracao1 = new Duracao(horaInicial, 2500);
        Duracao duracao2 = new Duracao(horaInicial, 1500);
        assertTrue(duracao1.MaiorQue(duracao2));
        assertFalse(duracao2.MaiorQue(duracao1));
    }

    @Test
    public void TesteDuracaoEmSegundos() {
        Hora horaInicial = new Hora(4, 0, 0);
        Duracao duracao = new Duracao(horaInicial, 6000);
        assertEquals(6000, duracao.duracaoEmSegundos());
    }

    @Test
    public void TesteRelatorio() {
        Hora horaInicial = new Hora(3, 0, 0);
        Duracao duracao = new Duracao(horaInicial, 7200);
        String esperado = "Hora Inicial: " + horaInicial.toString() + ", Duracao Total: 7200 segundos";
        assertEquals(esperado, duracao.relatorio());
    }
}