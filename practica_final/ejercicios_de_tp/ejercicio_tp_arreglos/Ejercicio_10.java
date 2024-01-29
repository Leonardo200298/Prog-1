package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Ejercicio_10 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        /*
         * 10. Hacer un programa que dado un arreglo de enteros de tamaño
         * 10 que se encuentra precargado, solicite al usuario un número
         * entero y elimine la primera ocurrencia del número (un número
         * igual) en el arreglo (si existe). Para ello tendrá que buscar la
         * posición y si está, realizar un corrimiento a izquierda (queda una
         * copia de la última posición del arreglo en la anteúltima posición).
         */
        int numero;
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio(arreglo);
        imprimir_arreglo_int(arreglo);
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            metodo_resolucion(arreglo, numero);

        } catch (Exception e) {
            System.out.println(e);
        }
        imprimir_arreglo_int2(arreglo);
    }

    public static void metodo_resolucion(int[] arreglo, int numero) {
        int pos = encontrar_posicion(arreglo, numero);
        int indice = 0;
        while (pos < MAX - 1 && indice < MAX - 1) {
            corrimiento_izq(arreglo, pos);
            pos = encontrar_posicion(arreglo, numero);
            indice++;
            System.out.println("Soy el indice "+indice);
           /*  System.out.println("Soy la posicion: "+pos);
            System.out.println("Soy MAX-1 " + (MAX-1)); */
           /*  if (numero == arreglo[MAX-1]) {

                arreglo[pos] = arreglo[pos];
                corrimiento_izq(arreglo, pos);

            } */
        }
    }

    public static void corrimiento_izq(int[] arr, int pos) {

        while (pos < MAX - 1) {
            arr[pos] = arr[pos + 1];
            pos++;

        }

    }

    public static int encontrar_posicion(int[] arr, int valor) {
        int pos = 0;

        while (MAX > pos && arr[pos] != valor) {
            pos++;
        }
        if (pos > 0 && valor == arr[pos - 1]) {
            while (pos > 0 && arr[pos] != valor) {
                pos--;
            }

        }

        return pos;
    }

    public static void cargar_arreglo_aleatorio(int[] arreglo) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arreglo[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

    public static void imprimir_arreglo_int2(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }

    }
}
