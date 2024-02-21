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
        int horas= (int)(diasNuevoPlaneta * 24);
        int minutos= (int)(horasNuevoPlaneta * 60);
        int segundos= (int)(minutosNuevoPlaneta * 60);

        System.out.println("Tiempo en el nuevo planeta: ");
        System.out.println(dias + " días, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }
    // Límites de repreesentación de datos
    public static void identificarLimitesRepresentacion(){
        System.out.println("Mayor numero representable en el nuevo planeta (dias): " + Double.MAX_VALUE);
        System.out.println("Mayor valor representable en el nuevo planeta (horas): " + (Double.MAX_VALUE / 24));
        System.out.println("Mayor valor representable en el nuevo planeta (minutos): " + (Double.MAX_VALUE / (24 * 60)));
        System.out.println("Mayor valor representable en el nuevo planeta (segundos): " + (Double.MAX_VALUE / (24 * 60 * 60)));
    }

    public static void main(String[] args) {
        double tiempoTierra = 365*24*60*60;//Equivalente a un año en segundos enla tierra.
        visualizarTiempo(tiempoTierra);
        identificarLimitesRepresentacion();
    }


}
