//código realizado en clase 22/02/2024
import java.util.Date;

public class I_cronometrocosmico {

    //Atributos de instancia: cada objeto tendrá un valor para estos atributos
    Date fechaPlanetaTierra;
    Date fechaNuevoPlaneta;

    //Atributos de clase: existe un único valor que se almacena en la clase
    static long FC = 2;//FC: Factor de conversión

    //Métodos constructores
    public I_cronometrocosmico() {
        fechaPlanetaTierra = new Date();
        long fnp= this.fechaPlanetaTierra.getTime();//fnp:fecha nuevo planeta
        fechaNuevoPlaneta = new Date((long)(fnp* I_cronometrocosmico.getFC()));
    }

    //Metodos de instancia
    //getters y setters
    public Date getFechaPlanetaTierra() {
        return fechaPlanetaTierra;
        //Devuelve el valor del atributo del objeto
    }

    public Date getFechaNuevoPlaneta() {
        return fechaNuevoPlaneta;
    }

    public void setFechaPlanetaTierra(Date fechaPlanetaTierra) {
        this.fechaPlanetaTierra = fechaPlanetaTierra;
        //Asigna al atributo del objeto el valor en el parámetro
    }

    public void setFechaNuevoPlaneta(Date fechaNuevoPlaneta) {
        this.fechaNuevoPlaneta = fechaNuevoPlaneta;
    }


    //Metodos de clase
    //getters y setters
    public static double getFC() {
        return FC;
    }
    public static void setFC(long FC) {
        I_cronometrocosmico.FC = FC;
        //Asigna al atributo de clase el valor indicado en el parámetro
    }

    //Método toString: perimite obtener la representacion textuañ del objeto



    @Override
    public String toString() {
        return "{"+
                "fechaPlanetaTierra=" + fechaPlanetaTierra +
                "\n, fechaNuevoPlaneta=" + fechaNuevoPlaneta +
                '}';
    }

}
