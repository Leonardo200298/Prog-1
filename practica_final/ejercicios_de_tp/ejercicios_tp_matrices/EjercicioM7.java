package practica_final.ejercicios_de_tp.ejercicios_tp_matrices;

import java.util.Random;

public class EjercicioM7 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD = 0.4;
    public static void main(String[] args) {
        /* 7. Hacer un programa que dada una matriz de enteros ordenada
        creciente por filas de tamaño 4*5 que se encuentra precargada,
        solicite al usuario un número entero y una fila, y luego inserte el
        número en la matriz en la fila indicada manteniendo su orden. */
        int[][] matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz(matint);
        imprimir_matriz(matint);
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
