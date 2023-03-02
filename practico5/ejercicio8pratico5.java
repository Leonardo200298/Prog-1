import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ejercicio8pratico5 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras que el usuario ingrese un caracter letra
         * minúscula, pida ingresar un numero entero. Si el número ingresado está
         * entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
         * numero.
         */
        char letra;
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un letra:");
            letra = entrada.readLine().charAt(0); 
            while ((letra <= 'z') && (letra >= 'a')) {
                System.out.println("Ingrese un numero entre en el 1 y el 5:");
                numero = Integer.valueOf(entrada.readLine());
                if ((numero <= 5) && (numero >= 1)){
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("La tabla del " + numero + " es " + numero + " * " + i + " = " + (i*numero));
                        
                    }
                }
                System.out.println("Ingrese un letra:");
                letra = entrada.readLine().charAt(0); 
            }
           
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
