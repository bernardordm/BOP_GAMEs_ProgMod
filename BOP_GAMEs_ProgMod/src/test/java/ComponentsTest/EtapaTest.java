package ComponentsTest;

import Components.Etapa;
import Components.Data;
import Components.Hora;
import Components.Duracao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EtapaTest {

    @Test
    public void TesteConstrutor() {
        Data data = new Data(12, 6, 2024);
        Hora horaInicial = new Hora(7, 45, 0);
        Duracao duracao = new Duracao(horaInicial, 4500);
        Etapa etapa = new Etapa(2, data, horaInicial, duracao);
        assertEquals(2, etapa.getNumeroEtapa());
        assertEquals(data, etapa.getData());
        assertEquals(horaInicial, etapa.getHoraInicial());
        assertEquals(duracao, etapa.getDuracao());
    }

    @Test
    public void TesteGetTempo() {
        Data data = new Data(12, 6, 2024);
        Hora horaInicial = new Hora(7, 45, 0);
        Duracao duracao = new Duracao(horaInicial, 4500);
        Etapa etapa = new Etapa(2, data, horaInicial, duracao);
        assertEquals(4500, etapa.getTempo());
    }

    @Test
    public void TesteSetNumeroEtapa() {
        Data data = new Data(12, 6, 2024);
        Hora horaInicial = new Hora(7, 45, 0);
        Duracao duracao = new Duracao(horaInicial, 4500);
        Etapa etapa = new Etapa(2, data, horaInicial, duracao);
        etapa.setNumeroEtapa(3);
        assertEquals(3, etapa.getNumeroEtapa());
    }

    @Test
    public void TesteSetData() {
        Data data = new Data(12, 6, 2024);
        Hora horaInicial = new Hora(7, 45, 0);
        Duracao duracao = new Duracao(horaInicial, 4500);
        Etapa etapa = new Etapa(2, data, horaInicial, duracao);
        Data novaData = new Data(13, 6, 2024);
        etapa.setData(novaData);
        assertEquals(novaData, etapa.getData());
    }

    @Test
    public void TesteSetHoraInicial() {
        Data data = new Data(12, 6, 2024);
        Hora horaInicial = new Hora(7, 45, 0);
        Duracao duracao = new Duracao(horaInicial, 4500);
        Etapa etapa = new Etapa(2, data, horaInicial, duracao);
        Hora novaHoraInicial = new Hora(8, 0, 0);
        etapa.setHoraInicial(novaHoraInicial);
        assertEquals(novaHoraInicial, etapa.getHoraInicial());
    }

    @Test
    public void TesteSetDuracao() {
        Data data = new Data(12, 6, 2024);
        Hora horaInicial = new Hora(7, 45, 0);
        Duracao duracao = new Duracao(horaInicial, 4500);
        Etapa etapa = new Etapa(2, data, horaInicial, duracao);
        Duracao novaDuracao = new Duracao(horaInicial, 5000);
        etapa.setDuracao(novaDuracao);
        assertEquals(novaDuracao, etapa.getDuracao());
    }
}