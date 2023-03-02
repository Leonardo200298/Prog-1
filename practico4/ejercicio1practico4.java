package practico4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio1practico4 {
    public static void main(String[] args) {
        /*
         * 1. Escribir un programa que permita el ingreso de un carácter y realice:
         * imprima es carácter dígito si el carácter ingresado es carácter
         * dígito,
         * o imprima no es carácter dígito
         */
        char valor;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un digito");
            valor = entrada.readLine().charAt(0);
            if ((valor >= '0') && (valor <= '9')) {
                System.out.println("El valor " + valor + " es caracter digito");
            } else {
                System.out.println("El valor " + valor + " no es caracter digito");
            }

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}