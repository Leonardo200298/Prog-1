package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_23 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD_NUMERO = 0.4;

    public static void main(String[] args) {
        /*
         * 23. Hacer un programa que invierta el orden de la última secuencia
         * en un arreglo.
         */
        int arreglo[] = new int[MAX];
        cargarSecuenciasInt(arreglo);
        imprimirArreglo(arreglo);
        System.out.println("------------------");
        invertir_orden(arreglo);
        imprimirArreglo(arreglo);
    }

    public static void invertir_orden(int[] arreglo) {
        int aux = 0;
        int ini = MAX - 1;
        int fin = buscar_fin(arreglo, ini);
        ini = buscar_inicio(arreglo, fin);
        int pos = 0;
        System.out.println("----------antes del while----------------");
        System.out.println("inicio: " + ini + " y fin: " + fin);
        while (pos < MAX && ini < fin) {
            aux = arreglo[fin - pos];
            arreglo[fin - pos] = arreglo[ini];
            arreglo[ini]=aux;
            ini++;
            pos++;
            System.out.println("----------dentro del while----------------");
            System.out.println("inicio: " + ini + " y fin: " + fin);
        }
        System.out.println("------------------despues del while------------------");
        System.out.println("inicio: " + ini + " y fin: " + fin +
        " con valor ini en arreglo: " + arreglo[ini] + " y con valor en fin: " + arreglo[fin]
        );
    }

    public static int buscar_fin(int[] arreglo, int ini) {
        while (ini > 0 && arreglo[ini] == 0) {
            ini--;
        }
        return ini;
    }

    public static int buscar_inicio(int[] arreglo, int fin) {
        while (fin > 0 && arreglo[fin] != 0) {
            fin--;
        }
        return fin + 1;
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
