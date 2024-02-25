import java.util.ArrayList;
import java.util.List;


public class II__recursosysuministros {
    private List<II_recurso> II_recursos;

    public II__recursosysuministros() {
        this.II_recursos = new ArrayList<>();
    }

    public void agregarRecurso(II_recurso II_recurso) {
        II_recursos.add(II_recurso);
    }

    public double calcularConsumoTotal() {
        double consumoTotal = 0;
        for (II_recurso II_recurso : II_recursos) {
            consumoTotal += II_recurso.getCantidad();
        }
        return consumoTotal;
    }

    public double calcularConsumoPromedio() {
        double consumoTotal = calcularConsumoTotal();
        return consumoTotal / II_recursos.size();
    }

    public double calcularConsumoMinimo() {
        double consumoMinimo = Double.MAX_VALUE;
        for (II_recurso II_recurso : II_recursos) {
            if (II_recurso.getCantidad() < consumoMinimo) {
                consumoMinimo = II_recurso.getCantidad();
            }
        }
        return consumoMinimo;
    }

    public double calcularConsumoMaximo() {
        double consumoMaximo = Double.MIN_VALUE;
        for (II_recurso II_recurso : II_recursos) {
            if (II_recurso.getCantidad() > consumoMaximo) {
                consumoMaximo = II_recurso.getCantidad();
            }
        }
        return consumoMaximo;
    }

}