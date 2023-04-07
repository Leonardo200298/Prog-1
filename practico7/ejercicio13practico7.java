import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio13practico7 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[MAX];
        int numero;
        try {
            cargar_arreglo_aleatorio_secuencias_int(arr);
            imprimir_arreglo_secuencias_int(arr);
            System.out.println("ingrese un numero");
            numero = Integer.valueOf(entrada.readLine());
            metodo_final(arr, numero);
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

    public static void metodo_final(int [] arr, int numero){
        int fin = 0;
        int inicio = encontrar_ini(arr,fin);
        int secuencia = 0;
        while(inicio != -1){
            fin = encontrar_fin(arr,inicio);
            if(fin != -1){
                secuencia = contar_secuencia(arr,inicio,fin);
                if(secuencia == numero){
                    for(int i = 0; i <= secuencia; i++){
                        corrimiento_izq(arr,inicio,fin);
                    }
                }
            }
            inicio = encontrar_ini(arr,fin+1);
        }
    }

    public static int encontrar_ini(int[] arr, int fin) {
        int posicion = fin;
        while (posicion < MAX && arr[posicion] == 0) {
            posicion++;
        }
        if (posicion < MAX) {
            return posicion;
        } else {
            return -1;
        }

    }

    public static int encontrar_fin(int[] arr, int ini) {
        int posicion = ini;
        while (posicion < MAX && arr[posicion] != 0) {
            posicion++;
        }
        if (posicion < MAX) {
            return posicion - 1;
        } else {
            return -1;
        }
    }

    public static int contar_secuencia(int[] arr, int ini, int fin) {
        int contador = 0;
        for (int i = ini; i <= fin; i++) {
            contador = contador + 1;
        }
        return contador;
    }

    public static void corrimiento_izq(int[] arr, int ini, int fin) {
       
            for (int i = ini; i <= fin; i++) {
                arr[i] = arr[i + 1];
            }
        
    }
}
