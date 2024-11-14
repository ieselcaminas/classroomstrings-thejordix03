public class palindromo {

    public static boolean espalindroma(String cadena) {

        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            char letraFinal = cadena.charAt(cadena.length() - 1);
            if (letra == letraFinal) return true;
            return false;
        }
        return false;
    }


    public static void main(String[] args) {
        String cadena = "rallar";
        System.out.println(espalindroma(cadena));
    }
}




