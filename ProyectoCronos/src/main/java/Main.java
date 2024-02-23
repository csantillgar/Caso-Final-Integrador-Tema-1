import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date myDate1 = new Date();
        String myString = DateFormat.getDateInstance().format(myDate1);
        System.out.println("Fecha1: " + myString);
        //El método toString permite obtener una representacion textual de un objeto
        System.out.println("Fecha1: "+myDate1.toString());

        long mls= System.currentTimeMillis();
        Date myDate2 = new Date(mls);
        System.out.println("Fecha2: "+myDate2.toString());

        myDate2.getTime();

        cronometrocosmico cc1 = new cronometrocosmico();
        System.out.println("cc1: "+cc1.toString());

        //Wrap clases
        System.out.println("Max. Entero: "+Integer.MAX_VALUE);

        recurso agua = new recurso("Agua", 100);
        recurso comida = new recurso("Comida", 50);
        recurso oxigeno = new recurso("Oxigeno", 200);
        recursosysuministros recursosysuministros = new recursosysuministros();
        recursosysuministros.agregarRecurso(agua);
        recursosysuministros.agregarRecurso(comida);





    }


}
