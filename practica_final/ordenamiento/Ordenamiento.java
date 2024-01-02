package practica_final.ordenamiento;

import java.util.Random;

public class Ordenamiento {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio(arreglo);
        imprimir_arreglo_int(arreglo);
        //ordenamiento
        ordenar_arreglo_seleccion(arreglo);
        imprimir_arreglo_int(arreglo);
    }

    public static void ordenar_arreglo_seleccion(int[] arreglo) {
        int pos_menor, tmp;
        for (int i = 0; i < MAX; i++) {
            pos_menor = i;
            for (int j =i + 1; j < MAX; j++) {
                if (arreglo[j] < arreglo[pos_menor]) {
                    pos_menor = j;
                }
                
            }
            //pensar en i y pos_menor como un numero de indice y su siguiente
            if (pos_menor != i) {
                tmp = arreglo[i];
                arreglo[i] = arreglo[pos_menor];
                arreglo[pos_menor] = tmp;
                
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
