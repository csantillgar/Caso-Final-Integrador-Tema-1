import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class IV__planificadortareas {
    private List<IV_tripulante> tripulacion;
    private Map<String, Integer> cargaTrabajoTripulantes;
    public IV__planificadortareas(){
        this.tripulacion = new ArrayList<>();
        this.cargaTrabajoTripulantes = new HashMap<>();
    }
    public void agregarTripulante(IV_tripulante IV_tripulante){
        tripulacion.add(IV_tripulante);
        cargaTrabajoTripulantes.put(IV_tripulante.getNombre(), 0);
    }
    public void distribuirTareas(List<Integer> tareas){
        if (tareas.size() != tripulacion.size()){
            throw new IllegalArgumentException("La cantidad de tareas debe coincidir con la cantidad de tripulantes");
        }

        for (int i = 0; i < tripulacion.size(); i++) {
            IV_tripulante tripulante = tripulacion.get(i);
            int tarea = tareas.get(i);
            tripulante.agregarTarea(tarea);
            cargaTrabajoTripulantes.put(tripulante.getNombre(), cargaTrabajoTripulantes.getOrDefault(tripulante.getNombre(), 0) + tarea);
        }
    }
    public void visualizarHorarios(){
        for (IV_tripulante IV_tripulante : tripulacion) {
            System.out.println("Tripulante: " + IV_tripulante.getNombre() + ", Carga de trabajo: " + IV_tripulante.getCargaTrabajo());
        }
        }
    public int obtenerCargaTrabajo(String nombreTripulante) {
        if (!cargaTrabajoTripulantes.containsKey(nombreTripulante)) {
            throw new IllegalArgumentException("El tripulante no existe.");
        }
        return cargaTrabajoTripulantes.get(nombreTripulante);


    }
    }

