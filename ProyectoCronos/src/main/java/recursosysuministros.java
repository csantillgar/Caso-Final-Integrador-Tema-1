import java.util.ArrayList;
import java.util.List;

public class recurso {
    private String nombre;
    private double cantidad;

    public recurso(String nombre, double cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}



public class recursosysuministros {
    private List<recurso> recursos;
    public recursosysuministros(){
        this.recursos = new ArrayList<>();
    }

}