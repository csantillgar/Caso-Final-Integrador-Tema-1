import java.util.ArrayList;
import java.util.List;
public class planificadortareas {
    private List<Tripulante> tripulacion;
    public planificadortareas(){
        this.tripulacion = new ArrayList<>();
    }
    public void agregarTripulante(Tripulante tripulante){
        tripulacion.add(tripulante);
    }
    public void distribuirTareas(List<Integer> tareas){
        if (tareas.size() != tripulacion.size()){
            throw new IllegalArgumentException("La cantidad de tareas debe coincidir con la cantidad de tripulantes");
        }
        for (int i = 0; i < tripulacion.size(); i++){
            tripulacion.get(i).agregarTarea(tareas.get(i));
        }
    }
    public void visualizarHorarios


}
