import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Arrays;

public class __Main {
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

        I_cronometrocosmico cc1 = new I_cronometrocosmico();
        System.out.println("cc1: "+cc1.toString());

        //Wrap clases
        System.out.println("Max. Entero: "+Integer.MAX_VALUE);

        II_recurso agua = new II_recurso("Agua", 100);
        II_recurso comida = new II_recurso("Comida", 50);
        II_recurso oxigeno = new II_recurso("Oxigeno", 200);
        II__recursosysuministros II__recursosysuministros = new II__recursosysuministros();
        II__recursosysuministros.agregarRecurso(agua);
        II__recursosysuministros.agregarRecurso(comida);
        II__recursosysuministros.agregarRecurso(oxigeno);

        System.out.println("Consumo total de recursos: "+ II__recursosysuministros.calcularConsumoTotal());
        System.out.println("Consumo promedio de recursos: "+ II__recursosysuministros.calcularConsumoPromedio());
        System.out.println("Consumo minimo de recursos: "+ II__recursosysuministros.calcularConsumoMinimo());
        System.out.println("Consumo maximo de recursos: "+ II__recursosysuministros.calcularConsumoMaximo());

        III_sistemaalertamonitoreo III_sistemaalertamonitoreo = new III_sistemaalertamonitoreo();

        //Simulación de eventos
        III_sistemaalertamonitoreo.monitorear("Temperatura", 30.5);
        III_sistemaalertamonitoreo.monitorear("Presion", 1001.2);
        III_sistemaalertamonitoreo.monitorear("Radiacion", 0.015);
        III_sistemaalertamonitoreo.monitorear("Humedad",0.5);

        List<String> tiposEventos = III_sistemaalertamonitoreo.obtenerTiposEventos();
        List<Double> valoresEventos = III_sistemaalertamonitoreo.obtenerValoresEventos();

        for (int i = 0; i < tiposEventos.size(); i++){
            System.out.println("Evento: "+tiposEventos.get(i)+" valor: "+valoresEventos.get(i));
        }
        List<String> eventosRaros = III_sistemaalertamonitoreo.obtenerEventosRaros(5);
        System.out.println("Primeros eventos raros: "+eventosRaros);

        List<Long> factoresPrimos = III_sistemaalertamonitoreo.descomponerEnFactoresPrimos(100);
        System.out.println("Factores primos de 100: "+factoresPrimos);

        IV__planificadortareas planificador= new IV__planificadortareas();

        planificador.agregarTripulante(new IV_tripulante("Tripulante 1"));
        planificador.agregarTripulante(new IV_tripulante("Tripulante 2"));
        planificador.agregarTripulante(new IV_tripulante("Tripulante 3"));

        planificador.distribuirTareas(Arrays.asList(5, 7, 3));

        planificador.visualizarHorarios();

        V_navegadorestelar navegador = new V_navegadorestelar(5, 5);

        navegador.generarTerrenoAleatorio();
        System.out.println("Terreno generado aleatoriamente:");
        navegador.visualizarTerreno();

        String mensaje = "Bienvenido a Cronos";
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Cantidad de vocales: " + VI_comunicadorinterplanetario.contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + VI_comunicadorinterplanetario.invertirMensaje(mensaje));
        System.out.println("¿Es palíndromo? " + VI_comunicadorinterplanetario.esPalindromo(mensaje));

    }
}
