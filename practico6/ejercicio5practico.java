package practico6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio5practico {
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario ingresa un caracter distinto
         * del caracter ‘*’, invoque a un método que imprima si es caracter dígito o
         * caracter letra minúscula, y si es letra minúscula imprimir si es vocal o
         * consonante.
         */
        char caracter;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un caracter distinto de *");
            caracter = entrada.readLine().charAt(0);
            while (caracter != '*') {
                verificadorDeChar(caracter);
                System.out.println("Ingrese un caracter distinto de *");
                caracter = entrada.readLine().charAt(0);
            }

        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void verificadorDeChar(char caracter) {
        if ((caracter <= '9') && (caracter >= '0')) {
            imprimir_digito(caracter);
        } else if ((caracter >= 'a') && (caracter <= 'z')) {
            consonante_y_vocal(caracter);
        }
    }

    public static void imprimir_digito(char digito) {
        System.out.println("El caracter ingresado es digito y es " + digito);

    }

    public static void consonante_y_vocal(char letra) {
        if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
            System.out.println("El caracter ingresado es vocal, pero tambien consonante y es " + letra);
        } else {
            System.out.println("El caracter ingresado es consonante" + letra);
        }
    }
}
