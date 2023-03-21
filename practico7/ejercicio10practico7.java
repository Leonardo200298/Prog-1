import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class ejercicio10practico7 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[MAX];
        int pos, ini, fin;
        try{
            cargar_arreglo_aleatorio_secuencias_int(arr);
            imprimir_arreglo_secuencias_int(arr);
            System.out.println("ingrese una posicion");
            pos = Integer.valueOf(entrada.readLine());
            while(pos < MAX-1){
                if(arr[pos] == 0){
                System.out.println("no existe una secuencia en esa posicion");
                System.out.println("ingrese una posicion");
                pos = Integer.valueOf(entrada.readLine());
            }else{
                ini = buscar_inicio(arr,pos);
                fin = buscar_fin(arr,ini);
                imprimir_arreglo_secuencias_int(arr);
                System.out.println("el inicio de la secuencia es "+ ini + " el final de la secuencia es "+ fin);
                System.out.println("ingrese una posicion, 20 para salir");
                pos = Integer.valueOf(entrada.readLine());
            }
            }
            }catch(Exception exc){
            System.out.println(exc);
        }
    }

    public static int buscar_inicio(int[] arr, int pos){
        int posicion = pos;
        while(arr[posicion] != 0){
            posicion--;
        }
        return posicion+1;
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
    public static int buscar_fin(int[] arr, int ini){
        int posicion = ini;
        while(arr[posicion] != 0){
            posicion++;
        }
        return posicion-1;
    }
}
