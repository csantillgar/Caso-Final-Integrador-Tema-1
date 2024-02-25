import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class III_sistemaalertamonitoreo {
    private List<String> tiposEventos;
    private List<Double> valoresEventos;

    public III_sistemaalertamonitoreo(){
        this.tiposEventos = new ArrayList<>();
        this.valoresEventos = new ArrayList<>();
    }
    public void monitorear(String tipoDato, double valor){
        if(valor<0){
            throw new IllegalArgumentException("El valor no puede ser negativo");
        }
        if(tipoDato == null || tipoDato.isEmpty()){
            throw new IllegalArgumentException("El tipo de dato no puede ser nulo o vacio");
        }
        tiposEventos.add(tipoDato);
        valoresEventos.add(valor);

    verificarEvento(tipoDato, valor);
    }
    private void verificarEvento(String tipo, double valor){
        System.out.println("Nuevo evento: "+tipo+" valor:  "+valor);
    }
    public List<String> obtenerTiposEventos(){
        return tiposEventos;
    }
    public List<Double> obtenerValoresEventos(){
        return valoresEventos;
    }
    public List<String> obtenerEventosRaros(int n) {
        List<String> eventosRaros = new ArrayList<>();
        int contadorTemperaturaAlta = 0; // Inicializar el contador fuera del bucle

        for (int i = 0; i < tiposEventos.size(); i++) {
            if (tiposEventos.get(i).equals("Temperatura") && valoresEventos.get(i) > 100) {
                contadorTemperaturaAlta++;
                if (contadorTemperaturaAlta >= n) {
                    eventosRaros.add("Temperatura alta");
                }
            }
        }

        // Agregar eventos raros de otros tipos
        Map<String, Long> conteoEventos = tiposEventos.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<String> eventosComunes = conteoEventos.entrySet().stream()
                .filter(entry -> entry.getValue() >= n)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        eventosRaros.addAll(tiposEventos.stream()
                .filter(evento -> !eventosComunes.contains(evento))
                .collect(Collectors.toList()));

        return eventosRaros;
    }



    public List<Long> descomponerEnFactoresPrimos(long n){
        List<Long> factoresPrimos = new ArrayList<>();
        for (long i = 2; i <= n; i++){
            while (n % i == 0){
                factoresPrimos.add(i);
                n /= i;
            }
        }
        return factoresPrimos;
    }
}






