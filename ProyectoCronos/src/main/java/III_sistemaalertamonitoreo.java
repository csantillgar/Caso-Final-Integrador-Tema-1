import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class III_sistemaalertamonitoreo {
    private List<String> tiposEventos;
    private List<Double> valoresEventos;

    public III_sistemaalertamonitoreo() {
        this.tiposEventos = new ArrayList<>();
        this.valoresEventos = new ArrayList<>();
    }

    public void monitorear(String tipoDato, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
        if (tipoDato == null || tipoDato.isEmpty()) {
            throw new IllegalArgumentException("El tipo de dato no puede ser nulo o vacío");
        }
        tiposEventos.add(tipoDato);
        valoresEventos.add(valor);

        verificarEvento(tipoDato, valor);
    }

    private void verificarEvento(String tipo, double valor) {
        System.out.println("Nuevo evento: " + tipo + " valor:  " + valor);
    }

    public List<String> obtenerTiposEventos() {
        return tiposEventos;
    }

    public List<Double> obtenerValoresEventos() {
        return valoresEventos;
    }

    public List<String> obtenerEventosRaros(double umbralTemperatura) {
        List<String> eventosRaros = new ArrayList<>();
        Map<String, Long> conteoEventos = tiposEventos.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Conteo de eventos raros basados en la frecuencia de eventos
        for (Map.Entry<String, Long> entry : conteoEventos.entrySet()) {
            if (entry.getValue() >= 100) {
                eventosRaros.add(entry.getKey());
            }
        }

        // Conteo de eventos raros basados en el umbral de temperatura
        int contadorTemperaturaAlta = 0; // Reiniciar el contador
        for (int i = 0; i < tiposEventos.size(); i++) {
            if (tiposEventos.get(i).equals("Temperatura") && valoresEventos.get(i) > umbralTemperatura) {
                contadorTemperaturaAlta++;
            }
        }
        if (contadorTemperaturaAlta >= 100) {
            eventosRaros.add("Temperatura alta");
        }
        return eventosRaros;
    }

    public List<Long> descomponerEnFactoresPrimos(long n) {
        List<Long> factoresPrimos = new ArrayList<>();
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                factoresPrimos.add(i);
                n /= i;
            }
        }
        return factoresPrimos;
    }
}




