import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class III_sistemaalertamonitoreotest {

    @Test
    public void monitorear_DeteccionEventosRaros() {
        III_sistemaalertamonitoreo III_sistemaalertamonitoreo = new III_sistemaalertamonitoreo();

        III_sistemaalertamonitoreo.monitorear("Temperatura", 100);
        III_sistemaalertamonitoreo.monitorear("Temperatura", 80);
        III_sistemaalertamonitoreo.monitorear("Temperatura", 110);
        III_sistemaalertamonitoreo.monitorear("Temperatura", 60);

        List<String> eventosRaros = III_sistemaalertamonitoreo.obtenerEventosRaros(3);

        assertEquals(3, eventosRaros.size());
        assertTrue(eventosRaros.contains("Temperatura alta"));
    }

    @Test
    public void descomponerEnFactoresPrimos_Correcto() {
        III_sistemaalertamonitoreo III_sistemaalertamonitoreo = new III_sistemaalertamonitoreo();

        List<Long> factoresPrimos = III_sistemaalertamonitoreo.descomponerEnFactoresPrimos(100);

        assertArrayEquals(new Long[]{2L, 2L, 5L, 5L}, factoresPrimos.toArray());
    }

    @Test(expected = IllegalArgumentException.class)
    public void monitorear_DatosAnomalos(){
        III_sistemaalertamonitoreo III_sistemaalertamonitoreo = new III_sistemaalertamonitoreo();

        III_sistemaalertamonitoreo.monitorear("Temperatura", -10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void monitorear_DatosFaltantes() {
        III_sistemaalertamonitoreo III_sistemaalertamonitoreo = new III_sistemaalertamonitoreo();

        III_sistemaalertamonitoreo.monitorear("",50);
    }

}

