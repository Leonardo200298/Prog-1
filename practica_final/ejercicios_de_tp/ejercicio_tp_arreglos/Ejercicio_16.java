package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_16 {
    public static final int MAX = 40, MAXVALOR = 9, MINVALOR = 1, SEPARADOR = 0;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        /*
         * 16. Hacer un programa que devuelva la posición de inicio y fin de la
         * secuencia de números distintos de ceros cuya suma del contenido
         * sea mayor.
         */
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        imprimir_arreglo_secuencias_int(arreglo);
        suma_mayor(arreglo);

    }
    public static void suma_mayor(int [] arreglo){
        int fin = 0;
        int ini = buscar_inicio(arreglo,fin);
        int sumaMayor = 0;
        int sumaMayorDeSecuencias=0;
        while (ini<MAX){
            fin = buscar_fin(arreglo,ini);
            if (ini<MAX) {
                
                sumaMayorDeSecuencias = contador_de_secuencias(arreglo, ini, fin);
                if (sumaMayor<sumaMayorDeSecuencias) {
                    sumaMayor = sumaMayorDeSecuencias;
                }
            }
            ini = buscar_inicio(arreglo,fin);
        }
        System.out.println("La secuencia con mayor sumatoria de numeros es: " + sumaMayor);
    }
    public static int contador_de_secuencias(int[] arreglo, int ini, int fin) {
        int acumuladorDeSuma = 0;
        for (int i = ini; i < fin; i++) {
            acumuladorDeSuma+=arreglo[i];
        }
        return acumuladorDeSuma;
    }
    private static int buscar_fin(int[] arreglo, int ini) {
        while (ini < MAX && arreglo[ini] != SEPARADOR) {
            ini++;
        }
        return ini;    
    }
    private static int buscar_inicio(int[] arreglo, int fin) {
        while (fin < MAX && arreglo[fin] == SEPARADOR) {
            fin++;
        }
        return fin;
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
