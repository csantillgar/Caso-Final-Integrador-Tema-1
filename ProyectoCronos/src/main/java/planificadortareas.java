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



}
