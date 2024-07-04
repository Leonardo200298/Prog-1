public class EjemploDeEliminacionParteDeSecuencia{
    public static final int MAX = 20;
    public static final int R = 2;
    public static final int SEPARADOR = 0;
    public static void main(String[] args) {
        int [] arr = {0,0,1,2,3,0,0,2,3,0,0,1,2,6,0,4,9,4,9,0};
  
        imprimir_arreglo_int(arr);
        recorrida_arrays(arr);
        System.out.println("---------------------------");
        imprimir_arreglo_int(arr);
    }
    public static void recorrida_arrays(int[] arr) {
        int ini = 0;
        int fin = -1;
        while (ini < MAX) {
            ini = buscar_ini(arr, fin + 1);
            if (ini < MAX) {
                fin = buscar_fin(arr, ini);
                if (fin-ini+1 > R) {
                    eliminamos_secuencia(arr, ini, fin);
                    fin = ini;
                }
            }
        }
    }
    public static void eliminamos_secuencia(int[] arreglo, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimiento_izquierda(arreglo, ini);

        }
    }
    public static void corrimiento_izquierda(int[] arr, int ini) {
        for (int i = ini; i < MAX-1; i++) {
            arr[i] = arr[i + 1];
        }
    }
    public static int buscar_fin(int[] arr, int ini) {
        while (ini < MAX && arr[ini] != SEPARADOR) {
            ini++;
        }
        return ini - 1;
    }
    public static int buscar_ini(int[] arr, int fin) {
        while (fin < MAX && arr[fin] == SEPARADOR) {
            fin++;
        }
        return fin;
    }
    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
    
}