import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3practico5 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras que el usuario ingrese un número entero
         * distinto de 0, pida ingresar otro número entero y lo imprima.
         */
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            while (numero != 0) {
                System.out.println("El numero es " + numero);
                System.out.println("Ingrese un numero");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
