package practica_final.ejercicios_de_tp.ejercicios_tp_matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class EjercicioM_7 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD = 0.4;

    public static void main(String[] args) {
        /*
         * 7. Hacer un programa que dada una matriz de enteros ordenada
         * creciente por filas de tamaño 4*5 que se encuentra precargada,
         * solicite al usuario un número entero y una fila, y luego inserte el
         * número en la matriz en la fila indicada manteniendo su orden.
         */
        try {
            int numero, nroFila;
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un numero para insertar: ");
            numero = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un numero de fila: ");
            nroFila = Integer.valueOf(entrada.readLine());
            int[][] matint = new int[MAXFILA][MAXCOLUMNA];
            System.out.println("-------------Matriz antes de insertar numero y ordenar-------------");
            cargar_matriz(matint);
            ordenamiento_por_seleccion(matint[nroFila]);
            imprimir_matriz(matint);
            insertar_y_ordenar(matint, numero, nroFila);
            System.out.println("-------------Matriz antes de insertar numero y ordenar-------------");
            imprimir_matriz(matint);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void insertar_y_ordenar(int[][] matint, int numero, int fila) {

        corrimiento_a_derecha(matint[fila], numero);
        ordenamiento_por_seleccion(matint[fila]);

    }

    public static void ordenamiento_por_seleccion(int[] arreglo) {
        int pos_mayor, temporal;
        for (int i = 0; i < MAXCOLUMNA; i++) {
            pos_mayor = i;
            for (int j = i + 1; j < MAXCOLUMNA; j++) {
                if (arreglo[pos_mayor] > arreglo[j]) {
                    pos_mayor = j;
                    
                }
            }

            if (pos_mayor != i) {
                temporal = arreglo[i];
                arreglo[i] = arreglo[pos_mayor];
                arreglo[pos_mayor] = temporal;
            }
        }
    }

    public static void corrimiento_a_derecha(int[] arreglo, int numero) {
        int pos = 5;
        while (pos > 0) {
            arreglo[pos] = arreglo[pos - 1];
            pos--;
        }
        arreglo[pos] = numero;
    }

    public static void cargar_matriz(int[][] mat) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            cargar_arreglo(mat[fila]);
        }
    }

    public static void cargar_arreglo(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_matriz(int[][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            imprimir_arreglo(mat[fila]);
        }
    }

    public static void imprimir_arreglo(int[] arr) {
        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }

}
