package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

public class Ejercicio_20 {
    public static final int MAX = 20;
    public static final int MAXPATRON = 10;
    public static final int SEPARADOR = 0;

    public static void main(String[] args) {
        /*
         * 20. Hacer un programa que elimine de un arreglo todas las
         * ocurrencias de una secuencia patrón dada por otro arreglo.
         * 
         */

        int arreglo[] = { 0, 2, 0, 4, 2, 0, 0, 1, 2, 3, 0, 2, 0, 0, 2, 3, 6, 4, 0, 0 };
        int patron[] = { 0, 0, 0, 1, 2, 3, 0, 0, 0, 0 };
        imprimirArreglo(arreglo);
        imprimirArreglo(arreglo);
        eliminar_ocurrencias_de_arreglo_de_secuencia_patron(arreglo, patron);
        System.out.println("----------------");
        imprimirArreglo(arreglo);

    }

    private static void eliminar_ocurrencias_de_arreglo_de_secuencia_patron(int[] arreglo, int[] patron) {
        int fin = 0;
        int ini = buscar_inicio(arreglo, fin);
        int finP = 0;
        boolean esLaSecuencia = false;
        int iniP = buscar_inicio(patron, finP);
        finP = buscar_fin(patron, iniP);
        while (ini < MAX) {
            fin = buscar_fin(arreglo, ini);
            if (ini < MAX) {
                esLaSecuencia = esSecuencia(arreglo, ini, fin, iniP, finP);
                if (fin - ini + 1 == finP - iniP + 1 && !esLaSecuencia) {
                    for (int i = iniP; i <= finP; i++) {

                        corrimiento_izq(arreglo, ini, fin);
                        /* fin = ini - 1; */

                    }
                    esLaSecuencia = false;
                }
            }
            ini = buscar_inicio(arreglo, fin + 1);
        }
    }

    public static void corrimiento_izq(int[] arreglo, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            arreglo[i] = arreglo[i + 1];
        }
    }

    public static boolean esSecuencia(int[] arreglo, int ini, int fin, int iniP, int finP) {
        while (ini <= fin && iniP <= finP && arreglo[ini] == arreglo[iniP]) {
            ini++;
            iniP++;
        }
        return ini > fin;
    }

    public static int buscar_fin(int[] arreglo, int ini) {
        while (ini < MAX && arreglo[ini] != SEPARADOR) {
            ini++;
        }
        return ini - 1;
    }

    public static int buscar_inicio(int[] arreglo, int fin) {
        while (fin < MAX && arreglo[fin] == SEPARADOR) {
            fin++;
        }
        return fin;
    }

    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
