package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_17 {
    public static final int MAX = 40, MAXVALOR = 9, MINVALOR = 1, SEPARADOR = 0;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        /*
         * 17.Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
         * el caso de eliminar secuencias se debe hacer corrimiento.
         * Hacer un programa que devuelva la posición de inicio y fin de la
         * anteúltima secuencia de números distintos de ceros.
         */
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        devolver_anteultima_secuencia(arreglo);
    }

    public static void devolver_anteultima_secuencia(int[] arreglo) {
        int contador = 0;
        int ini = MAX-1;
        int finAntSec = 0;
        int iniAntSec = 0;
        int fin = buscar_fin(arreglo, ini);
        while (fin>0 && contador<2) {
            ini = buscar_inicio(arreglo, fin);
            if (fin>0) {
                contador++;
                finAntSec = fin;
                iniAntSec = ini;
            }
            fin = buscar_fin(arreglo, ini);
        }
        System.out.println("El inicio de la anteultima secuencia es " + iniAntSec +
        " y el final de la anteultima secuencia es " + finAntSec
        );

    }

    private static int buscar_inicio(int[] arreglo, int fin) {
        while (fin>0 && arreglo[fin]  != SEPARADOR) {
            fin--;
        }
        return fin;
    }

    public static int buscar_fin(int[] arreglo, int ini) {
        while (ini>0 && arreglo[ini]  == SEPARADOR) {
            ini--;
        }
        return ini;
    }

    public static void cargar_arreglo_aleatorio_secuencias_int(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > probabilidad_numero) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }
}
