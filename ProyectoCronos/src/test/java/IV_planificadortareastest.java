import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
public class IV_planificadortareastest {
    @Test
    public void distribuirTareas_Correcto(){
        IV__planificadortareas planificador = new IV__planificadortareas();
        planificador.agregarTripulante(new IV_tripulante("Tripulante 1"));
        planificador.agregarTripulante(new IV_tripulante("Tripulante 2"));

        planificador.distribuirTareas(Arrays.asList(5, 7));

        assertEquals(5, planificador.obtenerCargaTrabajo("Tripulante 1"));
        assertEquals(7, planificador.obtenerCargaTrabajo("Tripulante 2"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void distribuirTareas_TripulanteNoExiste(){
        IV__planificadortareas planificador = new IV__planificadortareas();
        planificador.distribuirTareas(Arrays.asList(5));
    }
    @Test(expected = IllegalArgumentException.class)
    public void distribuirTareas_TareasExcedenTripulacion(){
        IV__planificadortareas planificador = new IV__planificadortareas();
        planificador.agregarTripulante(new IV_tripulante("Tripulante 1"));
        planificador.distribuirTareas(Arrays.asList(5, 7));
    }
}
