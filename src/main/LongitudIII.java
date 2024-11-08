public class LongitudIII {
    public static boolean verificarPalabrasCortas(String texto, int k) {
        String[] palabras = texto.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= k) {
                return false;
            }
        }
        return true;
    }
    public static boolean verificarPalabrasLargas(String texto, int k) {
        String[] palabras = texto.split("\\s+");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() <= k) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String texto = "esto es una ";
        int k = 1;
        boolean resultado = verificarPalabrasCortas(texto, k);
        boolean resultado2 = verificarPalabrasLargas(texto, k);


        if (resultado) {
            System.out.println("Todas las cadenas son cortas,miden menos que "+ k);
        }
        if(resultado2) {
            System.out.println("Hay alguna palabra larga,mide mas que "+ k);
        }
    }
}