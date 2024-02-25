public class VI_comunicadorinterplanetario {
   //Contar vocales
    public static int contarVocales(String mensaje) {
        int count = 0;
        for (char c : mensaje.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
    //Invertir mensaje
    public static String invertirMensaje(String mensaje) {
        return new StringBuilder(mensaje).reverse().toString();
    }




}
