public class tripulante {
    private String nombre;
    private int cargaTrabajo;

    public tripulante(String nombre){
        this.nombre = nombre;
        this.cargaTrabajo = 0;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCargaTrabajo(){
        return cargaTrabajo;
    }

}
