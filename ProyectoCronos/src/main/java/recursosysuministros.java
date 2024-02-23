import java.util.ArrayList;
import java.util.List;

public class recurso {
    private String nombre;
    private double cantidad;

    public recurso(String nombre, double cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public double getCantidad(){
        return cantidad;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
}
public class recursosysuministros {
    private List<recurso> recursos;
    public recursosysuministros(){
        this.recursos = new ArrayList<>();
    }
    public void agregarRecurso(recurso recurso){
        recursos.add(recurso);
    }
    public double calcularConsumoTotal(){
        double consumoTotal = 0;
        for(recurso recurso: recursos){
            consumoTotal += recurso.getCantidad();
        }
        return consumoTotal;
    }


}