package practica_final.ejercicios_de_tp.ejercicios_tp_matrices;

import java.util.Random;

public class ContarSecuenciasDeUnaMatriz {
    public static final int SEPARADOR = 0;
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD = 0.4;
    public static void main(String[] args) {
        int [][] matint = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_secuencias_int(matint);
        imprimir_matriz_int(matint);
        iterar_matrices_como_arreglo(matint);
    }
    public static void iterar_matrices_como_arreglo(int[][] mat) {
        int contador = 0;
        for (int fila = 0; fila < MAXFILA; fila++) {

            contador += contar_secuencias_en_matriz(mat[fila]);
        }
        System.out.println("La cantidad de secuencias es: " + contador);
    }
    public static int contar_secuencias_en_matriz(int[] matint) {
        int fin = 0;
        int contador = 0;
        int ini = buscar_ini(matint,fin);
        while (ini < MAXCOLUMNA) {
            fin = buscar_fin(matint,ini);
            if (ini < MAXCOLUMNA) {
                int longitudSecuencia = fin-ini+1;
                if (longitudSecuencia > 0) {
                    contador++;
                }
            }
            ini = buscar_ini(matint, fin + 1);
        }
        return contador;
    }
    private static int buscar_fin(int[] matint, int ini) {
        while (ini < MAXCOLUMNA && matint[ini] != SEPARADOR) {
            ini++;
        }
        return ini - 1;
    }
    public static int buscar_ini(int[] matint, int fin) {
        while (fin < MAXCOLUMNA && matint[fin] == SEPARADOR) {
            fin++;
        }
        return fin;
    }
    public static void cargar_matriz_secuencias_int(int [][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            cargar_arreglo_secuencias_int(mat[fila]);
        }
        System.out.println(" ");
    }

    public static void cargar_arreglo_secuencias_int(int [ ] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAXCOLUMNA - 1] = 0;
        for (int pos = 1; pos < MAXCOLUMNA - 1; pos++) {
            if (r.nextDouble() > PROBABILIDAD) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static void imprimir_matriz_int(int [][] mat) {
        for (int fila = 0; fila < MAXFILA; fila++) {
            imprimir_arreglo_int(mat[fila]);
        }
    }

    public static void imprimir_arreglo_int(int [] arr) {
        for (int pos = 0; pos < MAXCOLUMNA; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
