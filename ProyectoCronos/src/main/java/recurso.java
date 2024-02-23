public class recurso {
    private String nombre;
    private double cantidad;

    public recurso(String nombre, double cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public String getNombre(){
        return nombre;
    }
    public double getCantidad(){
        return cantidad;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
}