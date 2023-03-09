package practico6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio8practico6 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras que el usuario ingrese un caracter letra
         * minúscula, pida ingresar un numero entero. Si el número ingresado está
         * entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
         * numero.
         */
        char caracter;
        int numero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Escribe un caracter");
            caracter = entrada.readLine().charAt(0);
            while ((caracter >= 'a') && (caracter <= 'z')) {
                System.out.println("Ingrese un numero de 1 a 5");
                numero = Integer.valueOf(entrada.readLine());
                if ((numero >= 1) && (numero <= 5)) {
                    tablas_de_multiplicar(numero);

                }
                System.out.println("Escribe un caracter");
                caracter = entrada.readLine().charAt(0);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void tablas_de_multiplicar(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("La tabla del numero " + numero + " es " + numero + " * " + i + " = " + (numero * i));
        }
    }
}
