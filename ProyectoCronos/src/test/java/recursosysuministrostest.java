import org.junit.Test;
import static org.junit.Assert.*;

public class recursosysuministrostest{

    @Test

    public void calcularConsumoTotal_CalculoCorrecto(){
        recurso agua = new recurso("Agua", 100);
        recurso comida = new recurso("Comida", 50);
        recurso oxigeno = new recurso("Oxigeno", 200);

        recursosysuministros recursosysuministros = new recursosysuministros();
        recursosysuministros.agregarRecurso(agua);
        recursosysuministros.agregarRecurso(comida);
        recursosysuministros.agregarRecurso(oxigeno);

        assertEquals(350, recursosysuministros.calcularConsumoTotal(),0.01);
    }
    @Test
    public void calcularConsumoPromedio_CalculoCorrecto(){
        recurso agua = new recurso("Agua", 100);
        recurso comida = new recurso("Comida", 50);
        recurso oxigeno = new recurso("Oxigeno", 200);

        recursosysuministros recursosysuministros = new recursosysuministros();
        recursosysuministros.agregarRecurso(agua);
        recursosysuministros.agregarRecurso(comida);
        recursosysuministros.agregarRecurso(oxigeno);

        assertEquals(116.66, recursosysuministros.calcularConsumoPromedio(),0.01);
    }
    @Test
    public void calcularConsumoMaximo_CalculoCorrecto(){
        recurso agua = new recurso("Agua", 100);
        recurso comida = new recurso("Comida", 50);
        recurso oxigeno = new recurso("Oxigeno", 200);

        recursosysuministros recursosysuministros = new recursosysuministros();
        recursosysuministros.agregarRecurso(agua);
        recursosysuministros.agregarRecurso(comida);
        recursosysuministros.agregarRecurso(oxigeno);

        assertEquals(200, recursosysuministros.calcularConsumoMaximo(),0.01);
    }
}