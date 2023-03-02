import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio4practico5 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras que el usuario ingrese un caracter dígito
         * o caracter letra minúscula, imprima si es caracter dígito o caracter letra
         * minúscula, y si es letra minúscula imprimir si es vocal o consonante.
         */
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un digito");
            caracter = entrada.readLine().charAt(0);
            while (((caracter <= '9') && (caracter >= '0')) || ((caracter <= 'z') && (caracter >= 'a'))) {
                if ((caracter <= '9') && (caracter >= '0')) {
                    System.out.println("Es caracter digito");
                } else if ((caracter <= 'z') && (caracter >= 'a')) {
                    if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')) {
                        System.out.println("Es caracter letra minuscula vocal");
                    }
                    System.out.println("Es caracter letra minuscula consonante");
                }
                System.out.println("Ingrese un digito");
                caracter = entrada.readLine().charAt(0);
            }

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
