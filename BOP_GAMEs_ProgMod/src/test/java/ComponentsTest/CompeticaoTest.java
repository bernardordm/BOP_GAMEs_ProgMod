package ComponentsTest;

import Components.Competicao;
import Components.Ciclista;
import Components.Data;
import Components.Hora;
import Components.Duracao;
import Components.Etapa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompeticaoTest {

    @Test
    public void TesteConstrutor() {
        Competicao competicao = new Competicao(15);
        assertEquals(15, competicao.getNumeroDeEtapas());
    }

    @Test
    public void TesteSetNumeroDeEtapas() {
        Competicao competicao = new Competicao(10);
        competicao.setNumeroDeEtapas(20);
        assertEquals(20, competicao.getNumeroDeEtapas());
    }

    @Test
    public void TesteQuemTerminouNaFrenteEntreCiclistaEOutroCiclista() {
        Ciclista ciclista1 = new Ciclista(1, "Claudemir", "Pedro Leopoldo");
        Ciclista ciclista2 = new Ciclista(2, "Ana", "Belo Horizonte");

        Hora horaInicial = new Hora(7, 0, 0);
        Data data = new Data(12, 6, 2023);
        Duracao duracao1 = new Duracao(horaInicial, 3500);
        Duracao duracao2 = new Duracao(horaInicial, 3700);

        Etapa etapa1 = new Etapa(1, data, horaInicial, duracao1);
        Etapa etapa2 = new Etapa(1, data, horaInicial, duracao2);

        ciclista1.adicionarEtapa(etapa1);
        ciclista2.adicionarEtapa(etapa2);

        Competicao competicao = new Competicao(15);
        assertEquals(ciclista1, competicao.quemTerminouNaFrenteDoisCiclistas(ciclista1, ciclista2));
    }

    @Test
    public void TesteDiferencaDeTempoDoisCiclistas() {
        Ciclista ciclista1 = new Ciclista(1, "Claudemir", "Pedro Leopoldo");
        Ciclista ciclista2 = new Ciclista(2, "Paula", "Belo Horizonte");

        Hora horaInicial = new Hora(7, 0, 0);
        Data data = new Data(12, 6, 2023);
        Duracao duracao1 = new Duracao(horaInicial, 3500);
        Duracao duracao2 = new Duracao(horaInicial, 3700);

        Etapa etapa1 = new Etapa(1, data, horaInicial, duracao1);
        Etapa etapa2 = new Etapa(1, data, horaInicial, duracao2);

        ciclista1.adicionarEtapa(etapa1);
        ciclista2.adicionarEtapa(etapa2);

        Competicao competicao = new Competicao(15);
        assertEquals(200, competicao.diferencaDeTempoDoisCiclistas(ciclista1, ciclista2));
    }
}