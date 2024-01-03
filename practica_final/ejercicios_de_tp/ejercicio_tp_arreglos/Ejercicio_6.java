package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_6 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        /*6. Hacer un programa que dado un arreglo de enteros de tamaño 10
        que se encuentra cargado, obtenga la cantidad de números pares
        que tiene y la imprima. 
        */
        int [] arreglo = new int[MAX];
        cargar_arreglo_aleatorio(arreglo);
        imprimir_arreglo_int(arreglo);
        System.out.println("La cantidad de pares son: " + cantidadDePares(arreglo));
    }
    private static int cantidadDePares(int[] arreglo) {
        int contador = 0;
        for (int i = 0; i < MAX; i++) {
            if (arreglo[i]%2==0) {
                contador++;
            }
        }
        return contador;
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
