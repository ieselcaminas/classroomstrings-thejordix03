public class Reemplazar {

    public static String reemplazarCaracter(String cadena, int posicion, char nuevoCaracter) {

        char[] caracteres = cadena.toCharArray();
        caracteres[posicion] = nuevoCaracter;

        return new String(caracteres);
    }

    public static void main(String[] args) {
        String cadenaOriginal = "Chico";
        int posicion = 4;
        char nuevoCaracter = 'a';

        String resultado = reemplazarCaracter(cadenaOriginal, posicion, nuevoCaracter);

        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena resultado: " + resultado);

        String[] palabras = resultado.trim().split("\\s+");
        System.out.println("Palabras cambiadas:" + cadenaOriginal);
    }
}
