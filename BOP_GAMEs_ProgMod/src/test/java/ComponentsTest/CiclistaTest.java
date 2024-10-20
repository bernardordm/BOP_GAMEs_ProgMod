package ComponentsTest;

import Components.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CiclistaTest {

    @Test
    public void TesteCriarCiclistaCorretamente() {
        Ciclista ciclista = new Ciclista(2, "Claudemir", "Pedro Leopoldo");
        assertAll("ciclista",
                () -> assertEquals(2, ciclista.getNumero()),
                () -> assertEquals("Claudemir", ciclista.getNome()),
                () -> assertEquals("Pedro Leopoldo", ciclista.getCidadeDeOrigem()),
                () -> assertTrue(ciclista.getEtapas().isEmpty())
        );
    }

    @Test
    public void TesteAdicionarEtapaCorretamente() {
        Ciclista ciclista = new Ciclista(2, "Claudemir", "Pedro Leopoldo");
        Etapa etapa = new Etapa(2, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200));
        ciclista.adicionarEtapa(etapa);
        assertAll("etapa",
                () -> assertEquals(1, ciclista.getEtapas().size()),
                () -> assertEquals(etapa, ciclista.getEtapas().get(0))
        );
    }

    @Test
    public void TesteLancarExcecaoAoAdicionarMaisDe21Etapas() {
        Ciclista ciclista = new Ciclista(2, "Claudemir", "Pedro Leopoldo");
        for (int i = 0; i < 21; i++) {
            ciclista.adicionarEtapa(new Etapa(i, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        }
        assertThrows(IllegalArgumentException.class, () ->
                ciclista.adicionarEtapa(new Etapa(22, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)))
        );
    }

    @Test
    public void TesteCalcularTempoTotalCorretamente() {
        Ciclista ciclista = new Ciclista(2, "Claudemir", "Pedro Leopoldo");
        ciclista.adicionarEtapa(new Etapa(2, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        ciclista.adicionarEtapa(new Etapa(3, new Data(13, 6, 2024), new Hora(8, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        assertEquals(400, ciclista.getTempoTotal());
    }

    @Test
    public void TesteCompararCiclistasCorretamente() {
        Ciclista ciclista1 = new Ciclista(2, "Claudemir", "Pedro Leopoldo");
        Ciclista ciclista2 = new Ciclista(3, "Ana", "Belo Horizonte");
        ciclista1.adicionarEtapa(new Etapa(2, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        ciclista2.adicionarEtapa(new Etapa(2, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        assertAll("compararCiclistas",
                () -> assertEquals(0, ciclista1.compararCiclistas(ciclista2)),
                () -> assertEquals(0, ciclista2.compararCiclistas(ciclista1))
        );
    }

    @Test
    public void TesteCompararEtapasCorretamente() {
        Ciclista ciclista1 = new Ciclista(2, "Claudemir", "Pedro Leopoldo");
        Ciclista ciclista2 = new Ciclista(3, "Ana", "Belo Horizonte");
        ciclista1.adicionarEtapa(new Etapa(2, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        ciclista2.adicionarEtapa(new Etapa(2, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        assertEquals(0, ciclista1.compararEtapa(0, ciclista2));
    }

    @Test
    public void TesteCalcularDiferencaDeTempoCorretamente() {
        Ciclista ciclista1 = new Ciclista(2, "Claudemir", "Pedro Leopoldo");
        Ciclista ciclista2 = new Ciclista(3, "Ana", "Belo Horizonte");
        ciclista1.adicionarEtapa(new Etapa(2, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        ciclista2.adicionarEtapa(new Etapa(2, new Data(12, 6, 2024), new Hora(7, 0, 0), new Duracao(new Hora(0, 0, 0), 200)));
        assertEquals(0, ciclista1.diferencaTempo(ciclista2));
    }
}