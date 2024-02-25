import org.testng.annotations.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class I_cronometrocosmicotest {

    @Test
    public void testFechaPlanetaTierraInicializadaCorrectamente() {
        I_cronometrocosmico cronometro = new I_cronometrocosmico();
        assertNotNull(cronometro.getFechaPlanetaTierra());
    }

    @Test
    public void testFechaNuevoPlanetaCalculadaCorrectamente() {
        I_cronometrocosmico cronometro = new I_cronometrocosmico();
        Date fechaPlanetaTierra = cronometro.getFechaPlanetaTierra();
        long factorConversion = (long) I_cronometrocosmico.getFC();
        long fechaEsperada = fechaPlanetaTierra.getTime() * factorConversion;
        assertEquals(fechaEsperada, cronometro.getFechaNuevoPlaneta().getTime());
    }

    @Test
    public void testSetFC() {
        long nuevoFC = 3;
        I_cronometrocosmico.setFC(nuevoFC);
        assertEquals(nuevoFC, I_cronometrocosmico.getFC(), 0.001);
    }
}
