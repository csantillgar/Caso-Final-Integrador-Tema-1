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

}






