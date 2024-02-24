import java.util.ArrayList;
import java.util.List;

public class sistemaalertamonitoreo {
    private List<String> tiposEventos;
    private List<Double> valoresEventos;

    public sistemaalertamonitoreo(){
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
    public List<Long> descomponerEnFactoresPrimos(long numero){
        //Logica para descomponer un numero en factores primos pero en este casp se devuelve una lista vacia
        return new ArrayList<>();
    }
}






