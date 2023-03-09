package practico6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio10practico6 {
    public static void main(String[] args) {
        /*
         * 10. Escribir un programa que mientras el usuario ingrese un número entero
         * entre 1 y 10, pida ingresar un caracter, y por cada caracter ingresado
         * imprima:
         * – “letra minúscula” si el caracter es una letra del abecedario en minúscula;
         * – “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
         * – “dígito” si el caracter corresponde a un carácter número;
         * – “otro” para los restantes casos de caracteres.
         */
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        char caracter;
        try {
            System.out.println("Ingrese un numero:");
            numero = Integer.valueOf(entrada.readLine());
            while ((numero <= 10) && (numero >= 1)) {
                System.out.println("Ingrese un caracter:");
                caracter = entrada.readLine().charAt(0);
                verificadorDeChar(caracter);
                System.out.println("Ingrese un numero:");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void verificadorDeChar(char caracter) {
        if ((caracter <= '9') && (caracter >= '0')) {
            imprimir_digito();
        } else if ((caracter >= 'a') && (caracter <= 'z')) {
            consonante_minuscula();
        }else if((caracter >= 'A') && (caracter <= 'Z')){
            consonante_mayuscula();
        }else{
            System.out.println("Otro");
        }
    }

    public static void imprimir_digito() {
        System.out.println("dígito" );

    }

    public static void consonante_minuscula() {

        System.out.println("letra minúscula");
    }

    public static void consonante_mayuscula() {

        System.out.println("letra mayuscula");
    }

}
