package ComponentsTest;

import Components.Data;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataTest {

    @Test
    public void TesteConstrutor() {
        Data data = new Data(15, 8, 2024);
        assertEquals(15, data.getDia());
        assertEquals(8, data.getMes());
        assertEquals(2024, data.getAno());
    }

    @Test
    public void TesteGettersESetters() {
        Data data = new Data(2, 2, 2010);
        data.setDia(20);
        data.setMes(12);
        data.setAno(2025);
        assertEquals(20, data.getDia());
        assertEquals(12, data.getMes());
        assertEquals(2025, data.getAno());
    }

    @Test
    public void TesteToString() {
        Data data = new Data(7, 11, 2025);
        assertEquals("7/11/2025", data.toString());

        Data dataFormatada = new Data(3, 3, 2015);
        assertEquals("3/3/2015", dataFormatada.toString());
    }
}