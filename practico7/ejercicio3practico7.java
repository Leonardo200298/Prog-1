import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio3practico7 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;

    public static void main(String[] args) {
        int [] arreglo = new int[MAX];
        int pos;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        /*
         * Hacer un programa que dado un arreglo de enteros de tamaño 10 que se
         * encuentra
         * precargado, solicite al usuario una posición y realice un corrimiento a
         * izquierda o hacia la
         * menor posición del arreglo.
         */
        try {
            cargar_arreglo_aleatorio_int(arreglo);
            imprimir_arreglo_int(arreglo);
            System.out.println("Ingrese una posicion: ");
            pos = Integer.valueOf(entrada.readLine());
            corrimiento_a_izquierda(arreglo, pos);
            imprimir_arreglo_int(arreglo);
            
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

    public static void corrimiento_a_izquierda(int [] arr,int posicion){
        for (int i = posicion; i < MAX-1; i++) {
            arr[i] = arr[i+1];
        }
    }
}
