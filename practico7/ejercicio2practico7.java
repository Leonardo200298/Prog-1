import java.util.Random;

public class ejercicio2practico7 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int[] arreglo = new int[MAX];
        int cantidadDePares;
        /*
         * Hacer un programa que dado un arreglo de enteros de tamaño 10 que se
         * encuentra
         * precargado, obtenga la cantidad de números pares que tiene y la imprima.
         */

        try {
            cargar_arreglo_aleatorio_int(arreglo);
            imprimir_arreglo_int(arreglo);
            cantidadDePares = conseguir_pares(arreglo);
            System.out.println("La cantidad de pares es: " + cantidadDePares);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void cargar_arreglo_aleatorio_int(int[] arr) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arr[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }

    public static int conseguir_pares(int [] arr){
        int pares=0;
        for (int i = 0; i < MAX; i++) {
            if ((arr[i]%2)==0) {
                pares++;
            }
        }
        return pares;
    }
}
