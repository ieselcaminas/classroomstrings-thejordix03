public class Parentesis {

    public static boolean esParentizada(String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter == '(') {
                contador++;
            } else if (caracter == ')') {
                contador--;

                if (contador < 0) {
                    return false;
                }
            }
        }
        return contador == 0;
    }
    public static void main(String[] args) {
        String cadena1 = "Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";
        String cadena2 = "una )cadena (mal (parentizada)";
        String cadena3 = "(una)(d)(";
        String cadena4 = "Cadena(parentizada)";


        System.out.println("Cadena 1: " + esParentizada(cadena1)); // true
        System.out.println("Cadena 2: " + esParentizada(cadena2)); // false
        System.out.println("Cadena 3: " + esParentizada(cadena3)); // false
        System.out.println("Cadena 4: " + esParentizada(cadena4)); // false

    }
}
