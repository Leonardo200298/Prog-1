package practica_final.ejercicios_de_tp.ejercicios_tp_matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class EjercicioM_3 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD = 0.4;

    public static void main(String[] args) {
        /*
         * 3. Hacer un programa que dada una matriz de enteros de tamaño
         * 5*10 que se encuentra precargada, solicite al usuario una posición
         * fila, columna y realice un corrimiento a izquierda.
         */
        int posF, posM;
        try {
            int[][] matint = new int[MAXFILA][MAXCOLUMNA];
            cargar_matriz(matint);
            imprimir_matriz(matint);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese una posicion de fila: ");
            posF = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese una posicion de columna: ");
            posM = Integer.valueOf(entrada.readLine());
            realizar_corrimiento_con_posiciones_F_X_C(matint, posF, posM);
            System.out.println("---------------------");
            imprimir_matriz(matint);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void realizar_corrimiento_con_posiciones_F_X_C(int[][] matint, int posF, int posM) {
        metodo_resolucion(matint[posF], posM);
    }

    public static void metodo_resolucion(int[] arreglo, int posM) {
        corrimiento_a_izquierda(arreglo, posM);
    }

    public static void corrimiento_a_izquierda(int[] arreglo, int posM) {

        while (posM < MAXCOLUMNA - 1) {
            arreglo[posM] = arreglo[posM + 1];
            posM++;
        }
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
