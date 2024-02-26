package practica_final.ejercicios_de_tp.ejercicios_tp_matrices;

import java.util.Random;

public class EjercicioM_1 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD = 0.4;
    public static void main(String[] args) {
        /* 1. Hacer un programa que dada una matriz de enteros de tamaño
        5*10 que se encuentra precargada, invierta el orden del contenido
        por fila. Este intercambio no se debe realizar de manera explícita,
        hay que hacer un método que incluya una iteración de
        intercambio. */
        int [][] matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz(matint);
        System.out.println("----------------matriz antes de invertir----------------");
        imprimir_matriz(matint);
        intercambio_de_posiciones(matint);
        System.out.println("----------------matriz antes de invertir----------------");
        imprimir_matriz(matint);
    }

    public static void intercambio_de_posiciones(int[][] matint) {
        int auxiliar=0;
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA/2; j++) {
                auxiliar=matint[i][MAXCOLUMNA-1-j];
                matint[i][MAXCOLUMNA-1-j] = matint[i][j];
                matint[i][j] = auxiliar;
            }
          
        }
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
