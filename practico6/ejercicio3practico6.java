package practico6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio3practico6 {
    private static final int MIN = 1;
    private static final int NUMERO = 9;
    private static final int MAX = 10;
    public static void main(String[] args) {
        /*
         * Escribir un programa que mientras el usuario cargue desde
         * teclado un caracter letra minúscula, llame a un método
         * que imprime por pantalla la tabla de multiplicar de 9.
         */
        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("ingrese una letra minuscula: ");
            letra = entrada.readLine().charAt(0);
            while ((letra <= 'z') && (letra >= 'a')) {
                imprimir_tabla_de_multiplicar_del_nueve();
                System.out.println("ingrese una letra minuscula: ");
                letra = entrada.readLine().charAt(0);
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }
    public static void imprimir_tabla_de_multiplicar_del_nueve(){
        for (int i = MIN; i <= MAX; i++) {
            System.out.println("La tabla de multiplicar es " + (i*NUMERO));
        }
    }

}
