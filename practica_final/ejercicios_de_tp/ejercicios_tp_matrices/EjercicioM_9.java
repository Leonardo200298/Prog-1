package practica_final.ejercicios_de_tp.ejercicios_tp_matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class EjercicioM_9 {
    public static final int MAXFILA = 5;
    public static final int MAXCOLUMNA = 10;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD = 0.4;

    public static void main(String[] args) {
        /*
         * 9. Hacer un programa que dada una matriz de enteros de tamaño
         * 4*5 que se encuentra precargada, solicite al usuario el ingreso de
         * una fila y dos números enteros (columnas de la matriz), y ordene
         * de forma creciente la matriz en la fila indicada entre las dos
         * posiciones columnas ingresadas.
         */
        try {
            int nroFila, columnaIni, columnaFin;
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            int[][] matint = new int[MAXFILA][MAXCOLUMNA];
            System.out.println("Ingrese numero de fila: ");
            nroFila = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese numero de columna de inicio: ");
            columnaIni = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese numero de columna de fin: ");
            columnaFin = Integer.valueOf(entrada.readLine());
            cargar_matriz(matint);
            System.out.println("------matriz antes del metodo------");
            imprimir_matriz(matint);
            ordenar_entre_columna_inicio_y_columna_fin(matint[nroFila], columnaIni, columnaFin);
            System.out.println("------matriz despues del metodo------");
            imprimir_matriz(matint);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void ordenar_entre_columna_inicio_y_columna_fin(int[] arreglo, int columnaIni, int columnaFin) {
        System.out.println("La longitud de la fila es: " + arreglo.length);
        int pos_mayor, temporal;
        for (int i = columnaIni; i < columnaFin; i++) {
            pos_mayor = i;
            for (int j = i + 1; j < columnaFin; j++) {
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
