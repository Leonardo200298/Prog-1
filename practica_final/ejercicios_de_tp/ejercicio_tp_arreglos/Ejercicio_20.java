package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;

public class Ejercicio_20 {
    public static final int MAX = 20;
    public static final int MAXPATRON = 10;
    public static final int SEPARADOR = 0;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double PROBABILIDAD_NUMERO = 0.4;

    public static void main(String[] args) {
        /*
         * 20. Hacer un programa que elimine de un arreglo todas las
         * ocurrencias de una secuencia patrón dada por otro arreglo.
         * 
         */
        int arreglo[] = {0,2,0,4,2,0,0,1,2,3,0,2,0,0,2,3,6,4,0,0};
        int patron[] = {0,0,0,1,2,3,0,0,0,0};
        
        imprimirArreglo(arreglo);
        /* imprimirArregloPatron(patron); */
    }
/* 

    private static void imprimirArregloPatron(int[] patron) {
        for (int pos = 0; pos < MAXPATRON; pos++) {
            System.out.print("[" + patron[pos] + "]");
        }
        System.out.println("");
    } */

    public static void imprimirArreglo(int[] arr) {
        for (int pos = 0; pos < MAX; pos++) {
            System.out.print("[" + arr[pos] + "]");
        }
        System.out.println("");
    }
}
