import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class planificadortareas {
    private List<tripulante> tripulacion;
    private Map<String, Integer> cargaTrabajoTripulantes;
    public planificadortareas(){
        this.tripulacion = new ArrayList<>();
        this.cargaTrabajoTripulantes = new HashMap<>();
    }
    public void agregarTripulante(tripulante tripulante){
        tripulacion.add(tripulante);
        cargaTrabajoTripulantes.put(tripulante.getNombre(), 0);
    }
    public void distribuirTareas(List<Integer> tareas){
        if (tareas.size() != tripulacion.size()){
            throw new IllegalArgumentException("La cantidad de tareas debe coincidir con la cantidad de tripulantes");
        }
        for (int i = 0; i < tripulacion.size(); i++){
            tripulacion.get(i).agregarTarea(tareas.get(i));
            int cargaAnterior = cargaTrabajoTripulantes.get(tripulante.getNombre());
            cargaTrabajoTripulantes.put(tripulante.getNombre(), cargaAnterior + tareas.get(i));
        }
    }
    public void visualizarHorarios(){
        for (tripulante tripulante : tripulacion) {
            System.out.println("Tripulante: " + tripulante.getNombre() + ", Carga de trabajo: " + tripulante.getCargaTrabajo());
        }
        }

    }

