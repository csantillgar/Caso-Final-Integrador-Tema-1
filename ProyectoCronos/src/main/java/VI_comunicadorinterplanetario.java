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
    //verifica si un mensaje es un palíndromo
    public static boolean esPalindromo(String mensaje) {
        String clean = mensaje.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        for (int i = 0; i < length / 2; i++) {
            if (clean.charAt(i) != clean.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
