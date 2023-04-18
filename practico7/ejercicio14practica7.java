import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio14practica7 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[MAX];
        int numero;
        /*
         * Hacer un programa que dado el arreglo definido y precargado, y un número
         * entero
         * ingresado por el usuario, copie de forma continua las secuencias de tamaño
         * igual al
         * número ingresado en otro arreglo de iguales características e inicializado
         * con 0. La
         * copia en este último arreglo deben comenzar desde el principio del mismo.
         */
        try {
            cargar_arreglo_aleatorio_secuencias_int(arr);
            cargar_arreglo_aleatorio_secuencias_int(arr);
            imprimir_arreglo_secuencias_int(arr);
        } catch (Exception exc) {
            System.out.println(exc);
        }

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
