package practica_final.ejemplos_arr_sec;

import java.util.Random;

public class NuevoEjemploReccorrerArregloSecuencia {
    public static final int MAX = 40, MAXVALOR = 9, MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;
    public static final int SEPARADOR = 0;

    public static void main(String[] args) {
        int[] arrenteros = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arrenteros);
        imprimir_arreglo_secuencias_int(arrenteros);
        imprimir_suma_cada_secuencia(arrenteros);
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

    public static void imprimir_suma_cada_secuencia(int[] arr) {
        int inicio = 0, fin = -1, suma = 0;
        while ((inicio < MAX)) {
            inicio = obtener_inicio_secuencia(arr, fin + 1);
            if (inicio < MAX) {
                fin = obtener_fin_secuencia(arr, inicio);
                suma = obtener_suma_secuencia(arr, inicio, fin);
                System.out.println("La suma de la secuencia de " + inicio + " a " + fin + " es " + suma);
            }
        }
    }

    public static int obtener_fin_secuencia(int[] arrEnteros, int ini) {
        while (ini < MAX && arrEnteros[ini] != SEPARADOR) {
            ini++;

        }
        return ini - 1;
    }

    public static int obtener_inicio_secuencia(int[] arrEnteros, int ini) {
        while (ini < MAX && arrEnteros[ini] == SEPARADOR) {
            ini++;

        }
        return ini;
    }

    public static int obtener_suma_secuencia(int[] arr, int inicio, int fin) {
        int suma = 0;
        while (inicio <= fin) {
            suma += arr[inicio];
            inicio++;
        }
        return suma;
    }

    public static void imprimir_arreglo_secuencias_int(int[] arr) {
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

}
