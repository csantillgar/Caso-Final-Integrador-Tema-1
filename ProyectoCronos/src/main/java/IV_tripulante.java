public class IV_tripulante {
    private static String nombre;
    private int cargaTrabajo;

    public IV_tripulante(String nombre){
        this.nombre = nombre;
        this.cargaTrabajo = 0;
    }
    public static String getNombre(){
        return nombre;
    }
    public int getCargaTrabajo(){
        return cargaTrabajo;
    }
    public void agregarTarea(int cargaTarea){
        cargaTrabajo += cargaTarea;
    }

}
