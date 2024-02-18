package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

public class Ejercicio_21 {
    public static final int MAX = 20;
    public static final int SEPARADOR = 0;
    public static void main(String[] args) {
        /*
         * 21. Hacer un programa que elimine de un arreglo todas las
         * secuencias que tienen orden descendente entre sus elementos.
         */
        int arreglo[] = { 0, 2, 0, 4, 2, 0, 0, 1, 2, 3, 0, 2, 0, 0, 2, 3, 6, 4, 0, 0 };
        imprimirArreglo(arreglo);
        eliminacion_de_secuencias_ordenadas_descendentemente(arreglo);
        System.out.println("----------------");
        imprimirArreglo(arreglo);
    }

    public static void eliminacion_de_secuencias_ordenadas_descendentemente(int[] arreglo) {
        int fin = 0;
        int ini = buscar_inicio(arreglo, fin);
        while (ini < MAX) {
            fin = buscar_fin(arreglo, ini);
            if (ini < MAX) {
                boolean esSecuenciaDescendente = secuenciaDescendente(arreglo, ini, fin);
                if (esSecuenciaDescendente) {
                    for (int i = ini; i <= fin; i++) {
                        
                        corrimiento_izq(arreglo, ini, fin);
                    }
                }
            }
            ini = buscar_inicio(arreglo, fin + 1);
        }

    }

    public static void corrimiento_izq(int[] arreglo, int ini, int fin) {
        while (ini<=fin) {
            System.out.println("entre");
            arreglo[ini] = arreglo[ini+1];
            ini++;
        }
    }

    public static boolean secuenciaDescendente(int[] arreglo, int ini, int fin) {
        boolean ascendente = false;
        for (int i = ini; i <= fin; i++) {
            if (arreglo[fin] > arreglo[ini] || arreglo[fin] == arreglo[ini]){
                ascendente = true;
            }
        }
        return ascendente;
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
