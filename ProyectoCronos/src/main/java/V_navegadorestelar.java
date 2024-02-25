import java.util.Arrays;
public class V_navegadorestelar {
    private int[][] terreno;

    public V_navegadorestelar(int filas, int columnas) {
        this.terreno = new int[filas][columnas];
    }
    public void generarTerrenoAleatorio() {
        for (int i = 0; i < terreno.length; i++) {
            for (int j = 0; j < terreno[0].length; j++) {
                terreno[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void visualizarTerreno() {
        for (int[] fila : terreno) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
