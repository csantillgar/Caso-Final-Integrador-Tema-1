import java.util.ArrayList;
import java.util.List;


public class recursosysuministros {
    private List<recurso> recursos;

    public recursosysuministros() {
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(recurso recurso) {
        recursos.add(recurso);
    }

    public double calcularConsumoTotal() {
        double consumoTotal = 0;
        for (recurso recurso : recursos) {
            consumoTotal += recurso.getCantidad();
        }
        return consumoTotal;
    }

    public double calcularConsumoPromedio() {
        double consumoTotal = calcularConsumoTotal();
        return consumoTotal / recursos.size();
    }

    public double calcularConsumoMinimo() {
        double consumoMinimo = Double.MAX_VALUE;
        for (recurso recurso : recursos) {
            if (recurso.getCantidad() < consumoMinimo) {
                consumoMinimo = recurso.getCantidad();
            }
        }
        return consumoMinimo;
    }

    public double calcularConsumoMaximo() {
        double consumoMaximo = Double.MIN_VALUE;
        for (recurso recurso : recursos) {
            if (recurso.getCantidad() > consumoMaximo) {
                consumoMaximo = recurso.getCantidad();
            }
        }
        return consumoMaximo;
    }

}