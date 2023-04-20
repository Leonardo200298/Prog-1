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
        int[] arrCopia = new int[MAX];
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
            imprimir_arreglo_secuencias_int(arr);
            cargar_arreglo_con_ceros(arrCopia);
            imprimir_arreglo_de_ceros(arrCopia);
            System.out.println("Ingrese un numero: ");
            numero = Integer.valueOf(entrada.readLine());
            metodo_principal(arr, arrCopia, numero);
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
        System.out.println("Esto es un array de secuencias");
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print(arr[pos] + "|");
        }
        System.out.print("\n");
    }

    public static void cargar_arreglo_con_ceros(int[] arr) {
        System.out.println("Esto es un array de ceros");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void imprimir_arreglo_de_ceros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + "->" + arr[i]);
        }
    }

    public static void metodo_principal(int[] arreglo, int[] arreglo2, int num) {

    }

    public static int encontrar_inicio_de_secuencia(int[] arr, int fin) {
        int pos = fin;
        while ((pos < MAX) && (arr[pos] == 0)) {
            pos++;
        }
        if (pos < MAX) {
            return pos;
        } else {
            return -1;
        }
    }

    public static int encontrar_fin_de_secuencia(int[] arr, int ini) {
        int pos = ini;
        while ((pos < MAX) && (arr[pos] != 0)) {
            pos++;
        }
        if (pos<MAX){
            return pos-1;
        }else{
            return -1;
        }
    }
}
