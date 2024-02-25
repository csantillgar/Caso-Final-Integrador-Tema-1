import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Arrays;

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
        recursosysuministros.agregarRecurso(oxigeno);

        System.out.println("Consumo total de recursos: "+recursosysuministros.calcularConsumoTotal());
        System.out.println("Consumo promedio de recursos: "+recursosysuministros.calcularConsumoPromedio());
        System.out.println("Consumo minimo de recursos: "+recursosysuministros.calcularConsumoMinimo());
        System.out.println("Consumo maximo de recursos: "+recursosysuministros.calcularConsumoMaximo());

        sistemaalertamonitoreo sistemaalertamonitoreo = new sistemaalertamonitoreo();

        //Simulación de eventos
        sistemaalertamonitoreo.monitorear("Temperatura", 30.5);
        sistemaalertamonitoreo.monitorear("Presion", 1001.2);
        sistemaalertamonitoreo.monitorear("Radiacion", 0.015);
        sistemaalertamonitoreo.monitorear("Humedad",0.5);

        List<String> tiposEventos = sistemaalertamonitoreo.obtenerTiposEventos();
        List<Double> valoresEventos = sistemaalertamonitoreo.obtenerValoresEventos();

        for (int i = 0; i < tiposEventos.size(); i++){
            System.out.println("Evento: "+tiposEventos.get(i)+" valor: "+valoresEventos.get(i));
        }
        List<String> eventosRaros = sistemaalertamonitoreo.obtenerEventosRaros(5);
        System.out.println("Primeros eventos raros: "+eventosRaros);

        List<Long> factoresPrimos = sistemaalertamonitoreo.descomponerEnFactoresPrimos(100);
        System.out.println("Factores primos de 100: "+factoresPrimos);

        planificadortareas planificador= new planificadortareas();

        planificador.agregarTripulante(new tripulante("Tripulante 1"));
        planificador.agregarTripulante(new tripulante("Tripulante 2"));
        planificador.agregarTripulante(new tripulante("Tripulante 3"));

        planificador.distribuirTareas(Arrays.asList(5, 7, 3));

        planificador.visualizarHorarios();
    }
}
