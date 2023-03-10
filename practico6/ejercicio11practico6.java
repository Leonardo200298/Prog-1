package practico6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio11practico6 {
    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        try {
            /*
             * 11. Escribir un programa que mientras el usuario ingrese un número entero
             * entre 1 y 10 realice:
             * – Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para
             * el caracter
             * ingresado imprima a que tipo de carácter esta asociado:
             * • “letra minúscula” si el caracter es una letra del abecedario en minúscula;
             * • “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
             * • “dígito” si el caracter corresponde a un carácter número;
             * • “otro” para los restantes casos de caracteres.
             * – Si el numero ingresado es múltiplo de 5 imprima la tabla de multiplicar del
             * numero
             * ingresado.
             */
            System.out.println("Ingrese un numero:");
            numero = Integer.valueOf(entrada.readLine());
            while ((numero <= 10) && (numero >= 1)) {
                llamador_de_metodos(numero);
                System.out.println("Ingrese un numero:");
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void llamador_de_metodos(int numero) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char character;
        try {
            if ((numero % 3) == 0) {
                System.out.println("Ingrese un caracter");
                character = entrada.readLine().charAt(0);
                verificadorDeChar(character);
            } else if ((numero % 5) == 0) {
                tabla_de_multiplica(numero);
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
        } else if ((caracter >= 'A') && (caracter <= 'Z')) {
            consonante_mayuscula();
        } else {
            System.out.println("Otro");
        }
    }

    public static void imprimir_digito() {
        System.out.println("dígito");

    }

    public static void consonante_minuscula() {

        System.out.println("letra minúscula");
    }

    public static void consonante_mayuscula() {

        System.out.println("letra mayuscula");
    }

    public static void tabla_de_multiplica(int numero) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("La tabla del numero " + numero + " es " + numero + " * " + i + " = " + (numero * i));
        }
    }
}
