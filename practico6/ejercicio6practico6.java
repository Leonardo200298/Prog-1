package practico6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio6practico6 {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras que el usuario ingrese un número entero
         * natural, llame a un método que calcule la sumatoria entre 1 y dicho
         * numero y se lo retorne como resultado.
         */
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        int valor;
        try {
            System.out.println("Ingrese un numero:");
            numero = Integer.valueOf(entrada.readLine());
            while (numero >= 0) {
                valor = sumar_uno_mas_numero(numero);
                System.out.println("El valor es " + valor);
                System.out.println("Ingrese un numero:");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }

    public static int sumar_uno_mas_numero(int numero){
        return numero + 1;
    }
}
