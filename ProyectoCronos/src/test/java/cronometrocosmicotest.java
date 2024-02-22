import org.testng.annotations.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class cronometrocosmicotest {

    @Test
    public void testFechaPlanetaTierraInicializadaCorrectamente() {
        cronometrocosmico cronometro = new cronometrocosmico();
        assertNotNull(cronometro.getFechaPlanetaTierra());
    }

    @Test
    public void testFechaNuevoPlanetaCalculadaCorrectamente() {
        cronometrocosmico cronometro = new cronometrocosmico();
        Date fechaPlanetaTierra = cronometro.getFechaPlanetaTierra();
        long factorConversion = (long) cronometrocosmico.getFC();
        long fechaEsperada = fechaPlanetaTierra.getTime() * factorConversion;
        assertEquals(fechaEsperada, cronometro.getFechaNuevoPlaneta().getTime());
    }

    @Test
    public void testSetFC() {
        long nuevoFC = 3;
        cronometrocosmico.setFC(nuevoFC);
        assertEquals(nuevoFC, cronometrocosmico.getFC(), 0.001);
    }
}
