import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Random;
public class ejercicio1practico7 {
    public static final int MAX = 10;
    public static final int MAXVALOR = 10;
    public static final int MINVALOR = 1;
    public static void main(String[] args) {
       
          int [] arreglo = new int [MAX];
          int numero;
          int posicion;
          BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
          try{
            System.out.println("Ingrese un numero del 0 al 9");
            numero = Integer.valueOf(entrada.readLine());
            cargar_arreglo_aleatorio_int(arreglo);
            imprimir_arreglo_int(arreglo);
            posicion=obtener_pos_arreglo(arreglo, numero);
            if (posicion!=0){
              corrimiento_izq(arreglo,posicion);
            }else{
              System.out.println("El numero que ingreso no encontro");
            }
            imprimir_arreglo_int(arreglo);
          }catch(Exception exc){
            System.out.println(exc);
          }
      
        }
        public static void cargar_arreglo_aleatorio_int(int [] arr){
          Random r = new Random();
          for (int pos = 0; pos < MAX; pos++){
              arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
          }
          }
        public static void imprimir_arreglo_int(int [] arr){
          for (int pos = 0; pos < MAX; pos++){
              System.out.println("nombre_arreglo["+pos+"]=>: "+arr[pos]);
          }
          }
        public static int obtener_pos_arreglo(int [] arr, int numero){
          int posicion = 0;
          while ((posicion < MAX) && (arr[posicion] != numero)){
              posicion++;
          }
          return posicion;
          }
            public static void corrimiento_izq(int [] arr,int pos){
            for(int i = pos; i < MAX-1;i++){
              arr[i]=arr[i+1];
            }
          }
    
}
