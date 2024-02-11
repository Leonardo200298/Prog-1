package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_18 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD_NUMERO = 0.4;

    public static void main(String[] args) {
        /*
         * Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
         * el caso de eliminar secuencias se debe hacer corrimiento.
         * 18. Hacer un programa que devuelva la posición de inicio y de fin
         * de la secuencia de mayor tamaño.
         */
        int arreglo[] = new int[MAX];
        cargarSecuenciasInt(arreglo);
        imprimirArreglo(arreglo);
        encontrar_pos_de_secuencia_mayor_tamanio(arreglo);
    }

    public static void encontrar_pos_de_secuencia_mayor_tamanio(int[] arreglo) {
        int secMayor = 0;
        int ini = 0;
        int fin = buscar_fin(arreglo,ini);
        while (fin < MAX - 1) {
            ini = buscar_inicio(arreglo, fin);
            if (fin < MAX -1) {
                int tamanioSec = fin - ini + 1;
                
            }
            fin = buscar_fin(arreglo, ini);
        }
    }

    private static int buscar_inicio(int[] arreglo, int fin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar_inicio'");
    }

    private static int buscar_fin(int[] arreglo, int ini) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar_fin'");
    }

    public static void cargarSecuenciasInt(int[] arr) {
        Random r = new Random();
        arr[0] = 0;
        arr[MAX - 1] = 0;
        for (int pos = 1; pos < MAX - 1; pos++) {
            if (r.nextDouble() > PROBABILIDAD_NUMERO) {
                arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
            } else {
                arr[pos] = 0;
            }
        }
    }

    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
