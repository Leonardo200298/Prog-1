package practica_final.ejercicios_de_tp.ejercicios_tp_matrices;

import java.util.Random;

public class EjercicioM_2 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD = 0.4;

    public static void main(String[] args) {
        /*
         * 2. Hacer un programa que dada una matriz de enteros de tamaño
         * 5*10 que se encuentra precargada, obtenga la cantidad de
         * números pares que tiene y la imprima.
         */
        int[][] matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz(matint);
        imprimir_matriz(matint);
        cantidad_de_pares(matint);
    }
    public static void cantidad_de_pares(int[][] matint) {
        int acumuladorDePares = 0;
        for (int fila = 0; fila < MAXFILA; fila++) {
            acumuladorDePares+=numerosParesEnMatriz(matint[fila]);
        }
        System.out.println("La cantidad de pares en la matriz es de: " + acumuladorDePares);
    }

    public static int numerosParesEnMatriz(int[] arr) {
       int acumulador = 0;
       for (int i = 0; i < MAXCOLUMNA; i++) {
            if (arr[i]%2 == 0) {
                acumulador++;
            }
       }
       return acumulador;
    }
    public static void cargar_matriz (int [][] mat) {
        Random r = new Random();
        for (int fila = 0; fila < MAXFILA; fila++) {
            cargar_arreglo(mat[fila]);
        }
    }

    public static void cargar_arreglo(int [] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_matriz(int [][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            imprimir_arreglo(mat[fila]);
        }
    }

    public static void imprimir_arreglo(int [] arr) {
        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
