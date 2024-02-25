import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class sistemaalertamonitoreotest {

    @Test
    public void monitorear_DeteccionEventosRaros() {
        sistemaalertamonitoreo sistemaalertamonitoreo = new sistemaalertamonitoreo();

        sistemaalertamonitoreo.monitorear("Temperatura", 100);
        sistemaalertamonitoreo.monitorear("Temperatura", 80);
        sistemaalertamonitoreo.monitorear("Temperatura", 110);
        sistemaalertamonitoreo.monitorear("Temperatura", 60);

        List<String> eventosRaros = sistemaalertamonitoreo.obtenerEventosRaros(3);

        assertEquals(3, eventosRaros.size());
        assertTrue(eventosRaros.contains("Temperatura alta"));
    }

    @Test
    public void descomponerEnFactoresPrimos_Correcto() {
        sistemaalertamonitoreo sistemaalertamonitoreo = new sistemaalertamonitoreo();

        List<Long> factoresPrimos = sistemaalertamonitoreo.descomponerEnFactoresPrimos(100);

        assertArrayEquals(new Long[]{2L, 2L, 5L, 5L}, factoresPrimos.toArray());
    }

    @Test(expected = IllegalArgumentException.class)
    public void monitorear_DatosAnomalos(){
        sistemaalertamonitoreo sistemaalertamonitoreo = new sistemaalertamonitoreo();

        sistemaalertamonitoreo.monitorear("Temperatura", -10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void monitorear_DatosFaltantes() {
        sistemaalertamonitoreo sistemaalertamonitoreo = new sistemaalertamonitoreo();

        sistemaalertamonitoreo.monitorear("",50);
    }

}

