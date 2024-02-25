import org.junit.Test;
import static org.junit.Assert.*;

public class II_recursosysuministrostest {

    @Test

    public void calcularConsumoTotal_CalculoCorrecto(){
        II_recurso agua = new II_recurso("Agua", 100);
        II_recurso comida = new II_recurso("Comida", 50);
        II_recurso oxigeno = new II_recurso("Oxigeno", 200);

        II__recursosysuministros II__recursosysuministros = new II__recursosysuministros();
        II__recursosysuministros.agregarRecurso(agua);
        II__recursosysuministros.agregarRecurso(comida);
        II__recursosysuministros.agregarRecurso(oxigeno);

        assertEquals(350, II__recursosysuministros.calcularConsumoTotal(),0.01);
    }
    @Test
    public void calcularConsumoPromedio_CalculoCorrecto(){
        II_recurso agua = new II_recurso("Agua", 100);
        II_recurso comida = new II_recurso("Comida", 50);
        II_recurso oxigeno = new II_recurso("Oxigeno", 200);

        II__recursosysuministros II__recursosysuministros = new II__recursosysuministros();
        II__recursosysuministros.agregarRecurso(agua);
        II__recursosysuministros.agregarRecurso(comida);
        II__recursosysuministros.agregarRecurso(oxigeno);

        assertEquals(116.66, II__recursosysuministros.calcularConsumoPromedio(),0.01);
    }
    @Test
    public void calcularConsumoMaximo_CalculoCorrecto(){
        II_recurso agua = new II_recurso("Agua", 100);
        II_recurso comida = new II_recurso("Comida", 50);
        II_recurso oxigeno = new II_recurso("Oxigeno", 200);

        II__recursosysuministros II__recursosysuministros = new II__recursosysuministros();
        II__recursosysuministros.agregarRecurso(agua);
        II__recursosysuministros.agregarRecurso(comida);
        II__recursosysuministros.agregarRecurso(oxigeno);

        assertEquals(200, II__recursosysuministros.calcularConsumoMaximo(),0.01);
    }
}