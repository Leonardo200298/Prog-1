package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Ejercicio_9 {
    public static final int MAX= 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    /* 9. Hacer un programa que dado un arreglo de enteros de tamaño 10
        que se encuentra cargado, solicite al usuario un número entero y
        lo agregue al principio del arreglo (posición 0). Para ello tendrá
        que realizar un corrimiento a derecha (se pierde el último valor del
        arreglo) y colocar el número en el arreglo en la posición indicada. */
    public static void main(String[] args) throws NumberFormatException {
        int [] arreglo = new int[MAX];
        int valor;
        cargar_arreglo_aleatorio(arreglo);
        imprimir_arreglo_int(arreglo);
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Ingresa un numero por teclado:");
            valor = Integer.valueOf(entrada.readLine());
            ingresa_valor_en_posicion_cero(arreglo,valor);
        } catch (Exception e) {
            System.out.println(e);
        }
        imprimir_arreglo_int(arreglo);

    }

    public static void ingresa_valor_en_posicion_cero(int [] arr, int valor) {
        corrimiento_derecha(arr);
        arr[0] = valor;
    }

    private static void corrimiento_derecha(int[] arr) {
        int pos = MAX - 1;
        while (0<pos) {
            arr[pos] = arr[pos-1];
            pos--;
        }
       
    }

    public static void cargar_arreglo_aleatorio(int[] arreglo) {
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++) {
            arreglo[pos] = (r.nextInt(MAXVALOR - MINVALOR + 1) + MINVALOR);
        }
    }

    public static void imprimir_arreglo_int(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.println("nombre_arreglo[" + pos + "]=>: " + arr[pos]);
        }
    }
}
