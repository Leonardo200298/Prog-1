package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.util.Random;

public class Ejercicio_14 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
        /* 14. Hacer un programa que elimine los valores pares en un arreglo
        de tamaño MAX=10. */
        int[] arreglo = new int[MAX];
        cargar_arreglo_aleatorio(arreglo);
        imprimir_arreglo_int(arreglo);
        eliminar_pares(arreglo);
        System.out.println("--------------------");
        imprimir_arreglo_int(arreglo);
    }
    public static void eliminar_pares(int[] arreglo) {
        int pos = encontrar_posicion_pares(arreglo);
        int indice =0;
        
        while (pos < MAX-1 && indice < MAX - 1) {
            corrimiento_izq(arreglo,pos);
            pos = encontrar_posicion_pares(arreglo);
            indice ++;
        }
        if (arreglo[MAX - 1] % 2 == 0) {
            int posImpar = busqueda_de_ultimo_impar(arreglo, pos);
            for (int i = posImpar; i < MAX; i++) {
                arreglo[i] = arreglo[posImpar];
            };
        }
    }
    public static int busqueda_de_ultimo_impar(int[] arreglo, int pos) {
        while (pos > 0 && arreglo[pos]% 2 == 0) {
            pos--;
        }
        return pos;
      
    }
    public static void corrimiento_izq(int[] arreglo, int pos) {
        while (pos < MAX - 1) {
            arreglo[pos] = arreglo[pos + 1];
            pos++;
        }
    }
    public static int encontrar_posicion_pares(int[] arreglo) {
        int pos = 0;
        while ((arreglo[pos]%2==1) && pos < MAX - 1) {
            pos++;
        }
        return pos;
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