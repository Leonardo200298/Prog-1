package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_15 {

    public static final int MAX = 40, MAXVALOR = 9, MINVALOR = 1, SEPARADOR = 0;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        /*
         * Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
         * el caso de eliminar secuencias se debe hacer corrimiento.
         * 15. Hacer un programa que devuelva la posición de inicio y fin de la
         * primera secuencia de números distinta de ceros.
         */
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        System.out.println("------------------");
        imprimir_arreglo_secuencias_int(arreglo);
        impirmir_inicio_y_fin_secuencia(arreglo);

    }
    public static void impirmir_inicio_y_fin_secuencia(int[] arreglo) {
        int fin = 0;
        int ini = inicio_secuencia(arreglo, fin);
        fin = fin_secuencia(arreglo, ini);
        
        System.out.println("El primer valor, de la primera secuencia es: " + ini +
        " y el ultimo valor es: " + fin
        );
        
    }
    public static int inicio_secuencia(int [] arreglo, int comienzo){
        while (comienzo < MAX && arreglo[comienzo] == SEPARADOR) {
            comienzo++;
        }
        return comienzo;
    }
    public static int fin_secuencia(int [] arreglo, int ini){
        while (ini < MAX && arreglo[ini] != SEPARADOR) {
            ini++;
        }
        return ini-1;
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
