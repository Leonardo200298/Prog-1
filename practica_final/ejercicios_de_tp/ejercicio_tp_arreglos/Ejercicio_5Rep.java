package practica_final.ejercicios_de_tp.ejercicio_tp_arreglos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 /* 5. Hacer un programa que dado un arreglo de caracteres de tamaño
    10 que se encuentra cargado, invierta el orden del contenido. Este
    intercambio no se debe realizar de manera explícita, hay que
    hacer un método que incluya una iteración de intercambio. */
public class Ejercicio_5Rep {
    public static final int MAX = 10;
    public static void main(String[] args) {
        char [] arreglo = new char[MAX];
        cargar_arreglo(arreglo);
        imprimir_arreglo(arreglo);
        ordenar_segun_ejercicio(arreglo);
        imprimir_arreglo(arreglo);
    }
    private static void ordenar_segun_ejercicio(char[] arreglo) {

        
    }
    public static void cargar_arreglo(char [] arr){
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            for (int i = 0; i < MAX; i++) {
                System.out.println("carga el arreglo:");
                arr[i] = entrada.readLine().charAt(0);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void imprimir_arreglo(char [] arreglo){
        for (int i = 0; i < MAX; i++) {
            System.out.println("El arreglo arreglo[" + i + " ] -> " +  arreglo[i]);
        }
    }
}
