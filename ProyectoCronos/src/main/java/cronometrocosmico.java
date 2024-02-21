public class cronometrocosmico {
//Definimos las constantes para los factores de conversión
    private static final double TIERRA_DIAS_ANUALES = 365.25;
    private static final double CRONOS_DIAS_ANUALES = 687;//Dato inventado dias anuales de cronos.
    public static double convertirTiempo(double tiempoTierra){
    return tiempoTierra * (CRONOS_DIAS_ANUALES / TIERRA_DIAS_ANUALES);
}
//Visualizar tiempo en varios formatos
    public static void visualizarTiempo(double tiempoTierra){
        double tiempoNuevoPlaneta = convertirTiempo(tiempoTierra);

        double diasNuevoPlaneta = tiempoNuevoPlaneta % 1;
        double horasNuevoPlaneta = (diasNuevoPlaneta * 24)%1;
        double minutosNuevoPlaneta= (horasNuevoPlaneta * 60)%1;
        double segundosNuevoPlaneta = (minutosNuevoPlaneta * 60)%1;

        int dias= (int)tiempoNuevoPlaneta;

    }















}
