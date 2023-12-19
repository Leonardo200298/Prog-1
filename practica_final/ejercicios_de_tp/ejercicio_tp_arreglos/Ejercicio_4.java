package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio_4 {
    public static final int MAX = 10;
    public static void main(String[] args) {
        char [] arreglo = new char[MAX];
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            int pos = Integer.valueOf(entrada.readLine());      
            cargar_arreglo(arreglo);
            imprimir_arreglo(arreglo);
            buscar_elemento_devolver_posicion(pos, arreglo);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void cargar_arreglo(char [] arr){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            for (int i = 0; i < MAX; i++) {
                System.out.println("ingrese caracteres:");
                arr[i] = entrada.readLine().charAt(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public static void imprimir_arreglo(char [] arr){
        for (int i = 0; i < MAX; i++) {
            System.out.println("El arreglo arr["+i+"] ->"+ arr[i]);
        }
    }
    public static int buscar_elemento_devolver_posicion(int pos, char [] arr){
        int i = 0;
        while ((i < MAX - 1) && (arr[i] != pos)){
            i++;
        }
        if (i < MAX - 1) {
            return i;
        } else {
            return -1;
        }
     
    }
}
