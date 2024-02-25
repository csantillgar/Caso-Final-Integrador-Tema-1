import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class V_navegadorestelartest {

    @Test
    public void generarTerrenoAleatorio() {
        V_navegadorestelar navegador = new V_navegadorestelar(5, 5);
        navegador.generarTerrenoAleatorio();

        // Verificar que el tamaño del terreno sea correcto
        assertEquals(5, navegador.getTerreno().length);
        assertEquals(5, navegador.getTerreno()[0].length);
    }


}
