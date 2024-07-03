public class EjemploDeEliminacionParteDeSecuencia{
    public static final int MAX = 20;
    public static final int MAX2 = 2;
    public static final int SEPARADOR = 0;
    public static void main(String[] args) {
        int [] arr = {0,0,1,2,3,0,0,2,3,0,0,1,2,6,0,4,9,4,9,0};
        int [] arr2 = {2,3};
        imprimir_arreglo_int(arr);
        secuencias_repetidas(arr,arr2);
        imprimir_arreglo_int(arr);
    }
    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
    public static void secuencias_repetidas(int[] arr,int [] arr2) {
        int contador = 0;
        int fin = -1;
        int ini = 0;
        while (ini < MAX) {
            ini=buscarInicio(arr, fin + 1);
            if (ini < MAX) {
                fin = buscarFin(arr, ini);
                if (secuenciaRepetida(arr,ini,fin,arr2)) {
                    borrar_arreglo2_en_arr(arr, ini, fin);
                    contador++;
                }
            }
        }
        System.out.println("La cantidad de secuencias repetidas eliminadas son " + contador);
    }
    public static void borrar_arreglo2_en_arr(int[] arr, int ini, int fin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'borrar_arreglo2_en_arr'");
    }
    public static boolean secuenciaRepetida(int[] arr, int ini,int fin, int [] arr2) {
        boolean esRepetida = false;
        while (ini < MAX) {
            if (estaLaSecuenciaEnArr(arr[ini], arr2)) {
                esRepetida = true;
                ini++;
            }else{
                borrar_elementos(arr, ini,fin);
                fin--;
            }
        }
        return esRepetida;
    }
    public static void borrar_elementos(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++) {
            corrimiento_izq(arr, ini);
        }
    }
    public static void corrimiento_izq(int[] arr, int ini) {
        for (int i = ini; i < MAX - 1; i++) {
            arr[i] = arr[i+1];
        }
    }
    public static boolean estaLaSecuenciaEnArr(int valor, int[] arr2) {
        int ite = 0;
        boolean encontrado = false;
        while (ite < MAX2 && !encontrado) {
            if (arr2[ite] == valor) {
                encontrado = true;
            }
            ite++;
        }
        return encontrado;
    }
    public static int buscarFin(int[] arr, int ini) {
        while (ini < MAX && arr[ini]!=SEPARADOR) {
            ini++;
        }
        return ini - 1;
    }
    public static int buscarInicio(int[] arr, int fin) {
        while (fin < MAX && arr[fin] == SEPARADOR) {
            fin++;
        }
        return fin;
    }
}