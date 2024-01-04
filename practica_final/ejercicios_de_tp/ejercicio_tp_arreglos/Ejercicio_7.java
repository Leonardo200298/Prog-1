package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_7 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        /* 7. Implementar un método que realice un corrimiento a derecha en
        un arreglo ordenado de tamaño MAX=10 a partir de una posición. */
        int [] arreglo = new int[MAX];
        int pos = 3;
        cargar_arreglo_aleatorio(arreglo);
        imprimir_arreglo_int(arreglo);
        corrimiento_derecha(arreglo, pos);
        System.out.println("--------------------");
        imprimir_arreglo_int(arreglo);
    }

    private static void corrimiento_derecha(int[] arreglo, int pos) {
        int i = MAX -1;

        while (pos < i) {
            arreglo[i] = arreglo[i-1];
            i--;
        }
        arreglo[i] = pos;
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
}
