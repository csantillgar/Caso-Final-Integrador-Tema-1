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

    }

