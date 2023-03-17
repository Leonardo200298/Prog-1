import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class ejercicio6practico7{
    public static final int MAX = 20;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static final Double probabilidad_numero = 0.4;
    public static void main(String []args){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer entrada = -1;
        //muestro antes de ordenar, tanto arreglo como nro a insertar
        int []arreglo = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arreglo);
        System.out.print("Se generó el arreglo: ");
        imprimir_arreglo_int(arreglo);
        try {
        while (entrada == -1){
            System.out.println("Ingrese un número entre 1 y 20");
            entrada = Integer.valueOf(in.readLine())-1;
        }
        System.out.println(entrada);
        if(arreglo[entrada] == 0){
            System.out.println("No hay una secuencia en la posición indicada.");
        }else{
            System.out.println(
                "La secuencia en la posición "+ (entrada+1) 
                + " (que tiene el valor de " + arreglo[entrada] 
                + "), empieza en la posición " + (buscarIni(arreglo, entrada)+1)
                + " (que tiene el valor de "
                + arreglo[buscarIni(arreglo, entrada)]
                + ") y termina en la posición " + (buscarFin(arreglo, entrada)+1) 
                + " (que tiene el valor de "
                + arreglo[buscarFin(arreglo, entrada)]
                + ").");
        }
        } catch (NumberFormatException e) {
            System.out.println("Metiste algo que no era un número, chinchulín");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //métodos extra
    public static void cargar_arreglo_aleatorio_int(int []arr){
        Random r = new Random();
        for (int pos = 0; pos < MAX; pos++){
            arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
        }
    }

    public static void imprimir_arreglo_int(int []arr){
        for (int pos = 0; pos < MAX; pos++){
            if(pos+1 == MAX)
                System.out.print(arr[pos]+".");    
            else
                System.out.print(arr[pos]+", ");
        }
        System.out.println("");
    }

    public static int obtener_pos_arreglo(int []arr, int numero){
        int posicion = 0;
        while((posicion < MAX) && (arr[posicion] != numero)){
            posicion++;
        }
        return posicion;
    }

    public static int obtener_pos_insercion(int []arr, int numero){
        int pos = 0;
        while(pos < MAX && arr[pos] <= numero){
            pos++;
        }
        return pos;
    }

    public static void correr_a_der (int []arr, int pos){
        for (int i = MAX-1; i > pos; i--) {
            arr[i]=arr[i-1];
        }
    }

    public static void insertarOrdenado (int []arr, int valor){
        int pos = obtener_pos_insercion(arr, valor);
        correr_a_der(arr, pos);
        arr[pos] = valor;
    }

    public static int buscarIni (int []arr, int pos){
        int aux = pos;
        while(arr[aux-1] != 0){
            aux--;
        }
        return aux;
    }

    public static int buscarFin (int []arr, int pos){
        int aux = pos;
        while(arr[aux+1] != 0){
            aux++;
        }
        return aux;
    }

    public static void cargar_arreglo_aleatorio_secuencias_int(int []arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAX-1] = 0;
        for (int pos = 1; pos < MAX-1; pos++){
            if (r.nextDouble()>probabilidad_numero){
                arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
            }
            else{
                arr[pos]=0;
            }
        }
    }
}