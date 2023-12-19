package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_1 {
    public static final int MIN = 0;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int[] array = new int[MAX];

    
        try {
            load_array_int(array);

            print_array_int(array);
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }

    public static void load_array_int(int[] arr) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int pos = MIN; pos < MAX; pos++) {
                System.out.println("add elements to array: ");
                int valor = Integer.valueOf(entrada.readLine());
                if((valor>=1)&&(valor<=12)){

                    arr[pos] = valor;
                }else{
                    System.out.println("El numero debe estar entre 1 y 12 vuelve a cargar el numero");
                    

                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

    public static void print_array_int(int[] arr) {
        for (int pos = MIN; pos < MAX; pos++) {
            System.out.println("array[" + pos + "]=>: " + arr[pos]);
        }
    }

}
