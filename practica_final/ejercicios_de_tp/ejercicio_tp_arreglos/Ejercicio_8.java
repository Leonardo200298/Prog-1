package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_8 {
    public static final int MAX= 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        /* 8. Implementar un método que realice un corrimiento a izquierda en
            un arreglo ordenado de tamaño MAX=10 a partir de una posición. */

        int [] arreglo = new int[MAX];
        int pos = 2;
        cargar_arreglo_aleatorio(arreglo);
        imprimir_arreglo_int(arreglo);
        corrimiento_izquierda(arreglo, pos);
        System.out.println("--------------------");
        imprimir_arreglo_int(arreglo);
    }
     private static void corrimiento_izquierda(int[] arreglo, int pos) {
        
        while (pos < MAX -1) {
            arreglo[pos] = arreglo[pos+1];
            pos++;
        }
        
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
