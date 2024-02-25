import java.util.ArrayList;
import java.util.List;

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
    public List<String> obtenerEventosRaros(int n){
        //Logica para identificar los n primeros eventos raros pero en este ejemplo se devuelve una lista vacia
        return new ArrayList<>();
    }
    public List<Long> descomponerEnFactoresPrimos(long n){
        List<Long> factoresPrimos = new ArrayList<>();
        for (long i = 2; i <= n; i++){
            while (n % i == 0){
                factoresPrimos.add(i);
                n /= i;
            }
        }
        return new ArrayList<>();
    }
}






