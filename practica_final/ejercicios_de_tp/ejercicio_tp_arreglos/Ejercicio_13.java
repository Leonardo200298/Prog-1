package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_13 {
    /*
     * 13. Hacer un programa que inserte un elemento en un arreglo
     * (ordenado decrecientemente) de tamaño MAX=10.
     */

    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        int elemento = 2;
        cargar_arreglo_aleatorio(arreglo);
        imprimir_arreglo_int(arreglo);
        // ordenamiento
        ordenar_arreglo_seleccion(arreglo);
        System.out.println("-----------------");
        imprimir_arreglo_int(arreglo);
        insertar_elemento(arreglo, elemento);
        System.out.println("-----------------");
        imprimir_arreglo_int(arreglo);

    }

    public static void insertar_elemento(int[] arreglo, int elemento) {
        arreglo[3] = elemento;
        corrimiento_derecha(arreglo);
        ordenar_arreglo_seleccion(arreglo);
    }

    public static void corrimiento_derecha(int[] arreglo) {
        for (int i = MAX-1; i < 0; i--) {
            arreglo[i] = arreglo[i-1];
        }
    }

    public static void ordenar_arreglo_seleccion(int[] arreglo) {
        int pos_mayor, tmp;
        for (int i = 0; i < MAX; i++) {
            pos_mayor = i;
            for (int j = i + 1; j < MAX; j++) {
                if (arreglo[j] > arreglo[pos_mayor]) {
                    pos_mayor = j;
                }

            }
            // pensar en i y pos_mayor como un numero de indice y su siguiente
            if (pos_mayor != i) {
                tmp = arreglo[i];
                arreglo[i] = arreglo[pos_mayor];
                arreglo[pos_mayor] = tmp;

            }
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
