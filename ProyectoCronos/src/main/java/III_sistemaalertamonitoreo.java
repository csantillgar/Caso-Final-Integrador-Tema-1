import java.util.ArrayList;
import java.util.List;

public class III_sistemaalertamonitoreo {
    private List<String> tiposEventos;
    private List<Double> valoresEventos;

    public III_sistemaalertamonitoreo(){
        this.tiposEventos = new ArrayList<>();
        this.valoresEventos = new ArrayList<>();
    }
    public void monitorear(String tipo, double valor){
        tiposEventos.add(tipo);
        valoresEventos.add(valor);

    verificarEvento(tipo, valor);
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






