import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio2practico5 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario ingresa un caracter distinto
         * del caracter ‘*’, muestre por pantalla si es caracter digito, o si es
         * caracter
         * vocal minúscula.
         */
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter");
            caracter = entrada.readLine().charAt(0);
            while (caracter != '*') {
                if ((caracter <= '9') && (caracter >= '0')) {
                    System.out.println("El caracter es digito");
                } else if ((caracter <= 'z') && (caracter >= 'a')) {
                    System.out.println("El caracter es consonante");
                }
                System.out.println("Ingrese un caracter");
                caracter = entrada.readLine().charAt(0);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
