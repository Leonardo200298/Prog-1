package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_5 {
    /* 5. Hacer un programa que dado un arreglo de caracteres de tamaño
    10 que se encuentra cargado, invierta el orden del contenido. Este
    intercambio no se debe realizar de manera explícita, hay que
    hacer un método que incluya una iteración de intercambio. */
    public static final int MAX = 10;
    public static void main(String[] args) {
        char [] arreglo = new char[MAX];
        cargar_arreglo(arreglo);
        imprimir_arreglo(arreglo);
        invertir_orden(arreglo);
        System.out.println("-------------------------------");
        imprimir_arreglo(arreglo);
    }
    public static void cargar_arreglo(char[] arreglo) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < MAX; i++) {
                System.out.println("carga el array con valores char");
                arreglo[i] = entrada.readLine().charAt(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void imprimir_arreglo(char[] arreglo) {
        for (int i = 0; i < MAX; i++) {
            System.out.println("El arreglo arreglo["+i+"] -> " + arreglo[i]);
        }
    }
    public static void invertir_orden(char[] arreglo){
        char temp = ' ';
        for (int i = 0; i < MAX/2; i++) {
            temp = arreglo[MAX - 1 - i];
            arreglo[MAX - 1 - i] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}
