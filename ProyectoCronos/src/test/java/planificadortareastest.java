import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
public class planificadortareastest {
    @Test
    public void distribuirTareas_Correcto(){
        planificadortareas planificador = new planificadortareas();
        planificador.agregarTripulante(new tripulante("Tripulante 1"));
        planificador.agregarTripulante(new tripulante("Tripulante 2"));

        planificador.distribuirTareas(Arrays.asList(5, 7));

        assertEquals(5, planificador.obtenerCargaTrabajo("Tripulante 1"));
        assertEquals(7, planificador.obtenerCargaTrabajo("Tripulante 2"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void distribuirTareas_TripulanteNoExiste(){
        planificadortareas planificador = new planificadortareas();
        planificador.distribuirTareas(Arrays.asList(5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void distribuirTareas_TareasExcedenTripulacion(){
        planificadortareas planificador = new planificadortareas();
        planificador.agregarTripulante(new tripulante("Tripulante 1"));
        planificador.distribuirTareas(Arrays.asList(5, 7));
    }
}
