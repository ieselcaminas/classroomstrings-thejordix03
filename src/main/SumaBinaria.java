public class SumaBinaria {

    public static String sumarBinarios(String num1, String num2) {

        String resultado = "";
        int digitoA = Integer.parseInt("" + num1.charAt(0));
        char b1;
        char b2;
        int bit1;
        int bit2;
        int acarreo = 0 ;
        int suma;
        for(int i = num1.length() - 1; i >= 0; i--) {

            b1 = num1.charAt(i);
            b2 = num2.charAt(i);
            bit1 = Integer.parseInt("" + b1);
            bit2 = Integer.parseInt("" + b2);
            suma = bit1 + bit2 + acarreo;

            resultado = (suma % 2 == 0 ? "0" : "1") + resultado;
            acarreo = (suma <= 1 ? 0 : 1 );

        }
        if (acarreo == 1) {
            resultado = "1" + resultado;
        }
        return resultado;
    }
    public static void main(String[] args) {
        String bin1 = "111";
        String bin2 = "111";

        String resultado = sumarBinarios(bin1, bin2);

        System.out.println("La suma binaria de " + bin1 + " y " + bin2 + " es: " + resultado);
    }
}
