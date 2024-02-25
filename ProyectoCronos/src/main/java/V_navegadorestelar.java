import java.util.Arrays;
import java.util.Random;
public class V_navegadorestelar {
    private int[][] terreno;

    public V_navegadorestelar(int filas, int columnas) {
        this.terreno = new int[filas][columnas];
    }
    public void generarTerrenoAleatorio() {
        Random random = new Random();
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[0].length; j++) {
                terreno[i][j] = random.nextInt(100); // Genera valores aleatorios entre 0 y 99

            }
        }
    }

    public void visualizarTerreno() {
        for (int[] fila : terreno) {
            System.out.println(Arrays.toString(fila));
        }
    }

    // Getter para obtener el terreno
    public int[][] getTerreno() {
        return terreno;
    }
}
