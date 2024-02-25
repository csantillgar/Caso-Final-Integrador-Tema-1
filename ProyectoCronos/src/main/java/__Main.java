import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class __Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    cronometroCosmico();
                    break;
                case 2:
                    recursosYSuministros();
                    break;
                case 3:
                    sistemaAlertaMonitoreo();
                    break;
                case 4:
                    planificadorTareas();
                    break;
                case 5:
                    navegadorEstelar();
                    break;
                case 6:
                    comunicadorInterplanetario();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Cronómetro Cósmico");
        System.out.println("2. Recursos y Suministros");
        System.out.println("3. Sistema de Alerta y Monitoreo");
        System.out.println("4. Planificador de Tareas");
        System.out.println("5. Navegador Estelar");
        System.out.println("6. Comunicador Interplanetario");
        System.out.println("0. Salir");
    }

    private static void cronometroCosmico() {
        Date myDate1 = new Date();
        String myString = DateFormat.getDateInstance().format(myDate1);
        System.out.println("Fecha1: " + myString);
        // El método toString permite obtener una representación textual de un objeto
        System.out.println("Fecha1: " + myDate1.toString());

        long mls = System.currentTimeMillis();
        Date myDate2 = new Date(mls);
        System.out.println("Fecha2: " + myDate2.toString());

        myDate2.getTime();

        I_cronometrocosmico cc1 = new I_cronometrocosmico();
        System.out.println("cc1: " + cc1.toString());
    }

    private static void recursosYSuministros() {
        // Wrap clases
        System.out.println("Max. Entero: " + Integer.MAX_VALUE);

        II_recurso agua = new II_recurso("Agua", 100);
        II_recurso comida = new II_recurso("Comida", 50);
        II_recurso oxigeno = new II_recurso("Oxigeno", 200);
        II__recursosysuministros II__recursosysuministros = new II__recursosysuministros();
        II__recursosysuministros.agregarRecurso(agua);
        II__recursosysuministros.agregarRecurso(comida);
        II__recursosysuministros.agregarRecurso(oxigeno);

        System.out.println("Consumo total de recursos: " + II__recursosysuministros.calcularConsumoTotal());
        System.out.println("Consumo promedio de recursos: " + II__recursosysuministros.calcularConsumoPromedio());
        System.out.println("Consumo mínimo de recursos: " + II__recursosysuministros.calcularConsumoMinimo());
        System.out.println("Consumo máximo de recursos: " + II__recursosysuministros.calcularConsumoMaximo());
    }

    private static void sistemaAlertaMonitoreo() {
        III_sistemaalertamonitoreo III_sistemaalertamonitoreo = new III_sistemaalertamonitoreo();

        // Simulación de eventos
        III_sistemaalertamonitoreo.monitorear("Temperatura", 30.5);
        III_sistemaalertamonitoreo.monitorear("Presion", 1001.2);
        III_sistemaalertamonitoreo.monitorear("Radiacion", 0.015);
        III_sistemaalertamonitoreo.monitorear("Humedad", 0.5);

        List<String> tiposEventos = III_sistemaalertamonitoreo.obtenerTiposEventos();
        List<Double> valoresEventos = III_sistemaalertamonitoreo.obtenerValoresEventos();

        for (int i = 0; i < tiposEventos.size(); i++) {
            System.out.println("Evento: " + tiposEventos.get(i) + " valor: " + valoresEventos.get(i));
        }

        List<String> eventosRaros = III_sistemaalertamonitoreo.obtenerEventosRaros(3);
        System.out.println("Eventos raros: " + eventosRaros); // Imprime los eventos raros

        List<Long> factoresPrimos = III_sistemaalertamonitoreo.descomponerEnFactoresPrimos(100);
        System.out.println("Factores primos de 100: " + factoresPrimos);
    }

    private static void planificadorTareas() {
        IV__planificadortareas planificador = new IV__planificadortareas();

        planificador.agregarTripulante(new IV_tripulante("Tripulante 1"));
        planificador.agregarTripulante(new IV_tripulante("Tripulante 2"));
        planificador.agregarTripulante(new IV_tripulante("Tripulante 3"));

        planificador.distribuirTareas(Arrays.asList(5, 7, 3));

        planificador.visualizarHorarios();
    }

    private static void navegadorEstelar() {
        V_navegadorestelar navegador = new V_navegadorestelar(5, 5);

        navegador.generarTerrenoAleatorio();
        System.out.println("Terreno generado aleatoriamente:");
        navegador.visualizarTerreno();
    }

    private static void comunicadorInterplanetario() {
        String mensaje = "Bienvenido a Cronos";
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Cantidad de vocales: " + VI_comunicadorinterplanetario.contarVocales(mensaje));
        System.out.println("Mensaje invertido: " + VI_comunicadorinterplanetario.invertirMensaje(mensaje));
        System.out.println("¿Es palíndromo? " + VI_comunicadorinterplanetario.esPalindromo(mensaje));
    }
}

       


