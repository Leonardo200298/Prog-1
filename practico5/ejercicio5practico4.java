import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5practico4 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras que el usuario ingrese un número entero
         * entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente,
         * cuando sale del ciclo muestre por pantalla el resultado de la suma.
         */
        int numero;
        final int MAX = 10;
        final int MIN = 1;
        
        int sum=0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            while ((numero <= MAX) && (numero >= MIN)) {
                sum = sum + numero;
                System.out.println("Ingrese un numero");
                numero = Integer.valueOf(entrada.readLine());
                
                
            }
            System.out.println("La suma total es "+ sum);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
